/**
 * Created by Оксана on 19.01.2017.
 */

//Improved MyThread.
class MyThread2 implements Runnable {
    Thread thrd;    //A reference to the thread is stored in thrd.
    //В этой переменной хранится ссылка на поток.

    //Create a new thread.
    MyThread2(String name){
        thrd=new Thread(this, name);    //the thread is named when it is created.
        thrd.start();   //start the thread. Beging executing the thread,
    }

    //Beging execution of new thread.
    public void run(){  //Thread start executing here
        System.out.println(thrd.getName() + " - starting"); //"- запуск"
        try {
            for (int count = 0; count <10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() +
                        ", count is " + count); //count - счетчик
            }
        } catch (InterruptedException exc){
            System.out.println(thrd.getName() + " interrupted."); //Interrupted - прерванный
        }
        System.out.println(thrd.getName() + " terminating."); //terminating - завершение
    }
}

public class UseThreadsImproved {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        MyThread2 mt=new MyThread2("Child #1");
        //Now the thread start when it is created.

        for (int i = 0; i <50 ; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException exc){
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");
    }
}

//!!! ссьшка на поток хранится в переменной thrd экземпляра класса MyThread