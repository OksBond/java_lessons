/**
 * Created by Оксана on 22.01.2017.
 */

//Use synchronize to control access.
    //(2) Use a synchronized block to control access to sumArray().
    class SumArray{
    private int sum;

    synchronized int sumArray (int nums[]){ //sumArray() is synchronized
        //int sumArray (int nums[]){ //Here, sumArray() is not synchronized

        sum=0;  //reset sum - обнулить сумму

        for (int i = 0; i <nums.length ; i++) {
            sum+=nums[i];
            System.out.println("Running total for " +   //"Teкyщee значение суммы для "
            Thread.currentThread().getName() +
            " is " + sum);
            try {
                Thread.sleep(10);   //alloww task-switch - разрешить переключение задач
            }
            catch (InterruptedException exc){
                System.out.println("Thread interrupted."); //"Пpepывaниe основного потока"
            }
        }
        return sum;
    }
}

class MyThread4 implements Runnable{
    Thread thrd;
    static SumArray sa=new SumArray();
    int a[];
    int answer;

    //Construct a new thread.
    MyThread4 (String name, int nums[]){
        thrd=new Thread(this, name);
        a=nums;
        thrd.start();   //start the thread
    }

    //Begin execution of new thread.
    public void run() {
        int sum;

        System.out.println(thrd.getName() + " starting.");
        answer=sa.sumArray(a);

        /*Для синхр-и доступа к несинхр-му методу, нужно синхр-ть объект класса,
         содержащего этот метод: ввести вызов метода в синхр. блок кода.*/
        //(2) synchronize call to sumArray()
//        synchronized (sa){    //Here, calls to sumArray() on sa are synchronized/
//            answer=sa.sumArray(a)
//        };

        System.out.println("Sum for "+ thrd.getName()+
        " is " + answer);

        System.out.println(thrd.getName() + " terminating.");
    }
}

public class Sync {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};

        MyThread4 mt1=new MyThread4("Child #1", a);
        MyThread4 mt2=new MyThread4("Child #2", a);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        }
        catch (InterruptedException exc){
            System.out.println("Main thread interrupted.");
        }
    }
}
