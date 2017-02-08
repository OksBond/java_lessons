/**
 * Created by Оксана on 27.01.2017.
 */

//Suspending,resuming, and stopping a thread.
//Приостановка, возобновление и остановка потока
    class MyThread6 implements Runnable{
     Thread thrd;

    boolean suspended;  //Suspends thread when true.
    boolean stopped;    //Stops thread when true.

    MyThread6(String name){
        thrd=new Thread(this, name);
        suspended=false;
        stopped=false;
        thrd.start();
    }

    //This is the entry point for thread.
    public void run(){
        System.out.println(thrd.getName() + " starting.");
        try {
            for (int i = 1; i <1000 ; i++) {
                System.out.print(i + " ");
                if ((i%10)==0){
                    System.out.println();
                    Thread.sleep(250);
                }

                //Use synchronized block to check suspended and stopped.
                //Этот синхр. блок исп-ся для тестирования переменных suspended и stopped.
                synchronized (this) {
                    while ((suspended)){
                        wait();
                    }
                    if (stopped) break;
                }
            }
        } catch (InterruptedException exc){
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " exiting.");
    }

    //Stop the thread.
    synchronized void mystop(){
        stopped=true;

        //The following ensures(обеспечивать) that a suspended thread can be stopped.
        //Следующие операторы обеспечивают полную остановку приостановленного потока.
        suspended=false;
        notify();
    }

    //Suspend the thread.
    synchronized void mysuspend(){
        suspended=true;
    }

    //Resume the thread.
    synchronized void myresume(){
        suspended=false;
        notify();
    }
}

public class Suspend {
    public static void main(String[] args) {
        MyThread6 ob1=new MyThread6("My Thread");

        try {
            Thread.sleep(1000); //let ob1 thread start executing

            ob1.mysuspend();
            System.out.println("Suspeneing thread.");
            Thread.sleep(1000);

            ob1.myresume();
            System.out.println("Resuming thread.");
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("Suspeneing thread.");
            Thread.sleep(1000);

            ob1.myresume();
            System.out.println("Resuming thread.");
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("Stopping thread.");
            ob1.mystop();
        }
        catch (InterruptedException exc){
            System.out.println("Main thread Interrupted.");
        }

        //wait for thread to finish
        try {
            ob1.thrd.join();
        } catch (InterruptedException exc){
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}
