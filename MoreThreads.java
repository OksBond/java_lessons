/**
 * Created by Оксана on 19.01.2017.
 */

//Create multiple threads.
public class MoreThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        MyThread2 mt1=new MyThread2("Child #1");    //Create and start executing three threads.
        MyThread2 mt2=new MyThread2("Child #2");
        MyThread2 mt3=new MyThread2("Child #3");

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
