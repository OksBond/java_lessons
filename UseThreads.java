/**
 * Created by Оксана on 18.01.2017.
 */

//Create a thread by implementing Runnable
    //Создание потока путем реализации интерфейса Runnable

    class MyThread implements Runnable {
    /*Objects of MyThread can be run in their own threds
    because MyThread implements Runnable.
    Объекты типа MyThread могут выполняться в отдельных
    потоках, т.к. класс MyThread реализует интерфейс Runnable.
     */
    String thrdName;

    MyThread(String name){
        thrdName=name;
    }

    //Entry point of thread-Точка входа в поток.
    public void run(){  //Thread start executing here
        System.out.println(thrdName + " - starting"); //"- запуск"
        try {
            for (int count = 0; count <10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrdName +
                ", count is " + count); //count - счетчик
            }
        } catch (InterruptedException exc){
            System.out.println(thrdName + " interrupted."); //Interrupted - прерванный
        }
        System.out.println(thrdName + " terminating."); //terminating - завершение
    }
}

public class UseThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        //First, construct(создать) a MyThread object.
        MyThread mt=new MyThread("Child #1");
        //Create a runnable object - Создание исполняемого объекта

        //Next, construct a thread from that object-Затем сформировать поток на основе этого объекта.
        Thread newThrd=new Thread(mt);

        //Finally, start execution(выполнение) of the thread
        newThrd.start();    //Start running the thread - Запуск потока на выполнение

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
