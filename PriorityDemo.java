/**
 * Created by Оксана on 20.01.2017.
 */

//Demonstration threads priorities.
    class Priority implements Runnable{
    int count;
    Thread thrd;

    static boolean stop=false;
    static String currentName;

    /*Construct a new thread. Notice that this constructor
     doesn't actually starts the threads runing.
    Создание нового потока. Обратите внимание на то,
что конструктор не запускает поток на выполнение.
     */

    Priority (String name){
        thrd=new Thread(this,name);
        count=0;
        currentName=name;
    }

    //Begin execution of new thread.
    public void run(){
        System.out.println(thrd.getName()+ " starting.");
        do {
            count++;

            if (currentName.compareTo(thrd.getName())!=0) {
                currentName=thrd.getName();
                System.out.println("In " + currentName);
            }
        }while (stop==false && count<10000000); //The first thread to 10,000,000 stops all threads.
        //Первый же поток, в кот. достигнуто зн-е 10,000,000, завершает остальные потоки
        stop=true;

        System.out.println("\n" + thrd.getName() + " terminating.");
    }
}

public class PriorityDemo {
    public static void main(String[] args) {
        Priority mt1=new Priority("High Priority");
        Priority mt2=new Priority("Low Priority");

        //set the priorities
        mt1.thrd.setPriority(Thread.NORM_PRIORITY+2); //Give mt1 a higher priority than mt2
        mt2.thrd.setPriority(Thread.NORM_PRIORITY-2);

        //start the threads
        mt1.thrd.start();
        mt2.thrd.start();

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        }
        catch (InterruptedException exc){
            System.out.println("Main thread interrupted.");
        }
        System.out.println("\nHigh priority thread counted to " +
            mt1.count);//counted - посчитанный, выполненный до
        System.out.println("\nLow priority thread counted to " +
                mt2.count);
    }
}
