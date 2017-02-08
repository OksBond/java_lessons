/**
 * Created by Оксана on 19.01.2017.
 */

//Use isAlive()
public class MoreThreads2 {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        MyThread2 mt1=new MyThread2("Child #1");    //Create and start executing three threads.
        MyThread2 mt2=new MyThread2("Child #2");
        MyThread2 mt3=new MyThread2("Child #3");

       do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException exc){
                System.out.println("Main thread interrupted.");
            }
        } while (mt1.thrd.isAlive() ||  //This waits until all threads terminate.
               mt2.thrd.isAlive() ||
               mt3.thrd.isAlive());

        System.out.println("Main thread ending.");
    }
}
