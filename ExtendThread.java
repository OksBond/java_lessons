/**
 * Created by Оксана on 19.01.2017.
 */

/*This Try 11.1
Extend Thread
 */
class MyThread3 extends Thread {
    //Create a new thread.
    MyThread3(String name){
        super(name);    //name thread - присвоить имя потоку.
        start();   //start the thread.
    }

    //Beging execution of new thread.
    public void run(){
        System.out.println(getName() + " - starting"); //"- запуск"
        try {
            for (int count = 0; count <10; count++) {
                Thread.sleep(400);
                System.out.println("In " + getName() +
                        ", count is " + count); //count - счетчик
            }
        } catch (InterruptedException exc){
            System.out.println(getName() + " interrupted."); //Interrupted - прерванный
        }
        System.out.println(getName() + " terminating."); //terminating - завершение
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        MyThread mt=new MyThread("Child #1");
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
