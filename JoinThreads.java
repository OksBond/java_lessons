/**
 * Created by Оксана on 19.01.2017.
 */

//Use join()
public class JoinThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        MyThread2 mt1=new MyThread2("Child #1");    //Create and start executing three threads.
        MyThread2 mt2=new MyThread2("Child #2");
        MyThread2 mt3=new MyThread2("Child #3");

        try {
            mt1.thrd.join();    //Wait until the specified thread ends.
            //Ожидание, пока указанный метод не завершится
            System.out.println("Child #1 joined."); //Child #1 - присоединен

            mt2.thrd.join();
            System.out.println("Child #2 joined.");

            mt3.thrd.join();
            System.out.println("Child #3 joined.");
            }
            catch (InterruptedException exc){
                System.out.println("Main thread interrupted.");
            }
        System.out.println("Main thread ending.");
    }
}
