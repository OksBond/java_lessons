/**
 * Created by Оксана on 23.01.2017.
 */

//Use wait() and notify() to create a ticking clock.
//Использование методов wait() и notify() для имитации часов
    class TickTock {
    String state;   //contain the state of the clock - содержит сведения о состоянии(state) часов

    synchronized void tick(boolean running){
        if (!running){  //stop the clock
            state="ticked";
            notify();   //notify any waiting threads - уведомить ожидающие потоки
            return;
        }

        System.out.print("Tick ");

        state="ticked"; //set the current state to ticked(...после такта "тик")

        notify(); //let tock() run; tick() notifies tock()
        //позволить выполняться м. tock(); м.tick() посылает уведомление м.tock()
        try {
            while (!state.equals("tocked"))
                wait(); //wait for tock() to complete; tick() wait for tock()
            //ожидать до завершения м.tock (); м.tick() ожидает завершение м.tock()
        }
        catch (InterruptedException exc){
            System.out.println("Thread interrupted."); //"Пpepывaниe потока"
        }
    }

    synchronized void tock(boolean running){
        if (!running) {//stop the clock
            state="tocked";
            notify();   //notify any waiting threads - уведомить ожидающие потоки
            return;
        }

        System.out.println("Tock");

        state="tocked"; //set the current state to tocked(...после такта "так")

        notify(); //let tick() run; tock() notifies tick()
        //позволить выполняться м. tick(); м.tock() посылает уведомление м.tick()
        try {
            while (!state.equals("ticked"))
                wait(); //wait for tick() to complete; tock() wait for tick()
            //ожидать до завершения м.tick (); м.tock() ожидает завершение м.tick()
        }
        catch (InterruptedException exc){
            System.out.println("Thread interrupted.");
        }
    }
}

class MyThread5 implements Runnable{
    Thread thrd;
    TickTock ttOb;

    //Construct a new thread.
    MyThread5 (String name, TickTock tt) {
        thrd=new Thread(this, name);
        ttOb=tt;
        thrd.start();   //start the thread
    }

    //Begin execution of new thread.
    public void run(){
        if (thrd.getName().compareTo("Tick")==0){
            for (int i = 0; i <5 ; i++) ttOb.tick(true);
            ttOb.tick(false);
        }
        else {
            for (int i = 0; i <5 ; i++) ttOb.tock(true);
            ttOb.tock(false);
        }
    }
}

public class ThreadCom {
    public static void main(String[] args) {
        TickTock tt=new TickTock();
        MyThread5 mt1=new MyThread5("Tick", tt);
        MyThread5 mt2=new MyThread5("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        }
        catch (InterruptedException exc){
            System.out.println("Main thread interrupted.");
        }
    }
}
