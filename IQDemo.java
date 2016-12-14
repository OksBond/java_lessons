import java.lang.*;
import java.lang.Override;

/**
 * Created by Оксана on 13.12.2016.
 */

//A fixed-size queue class for characters.
    //Класс, реализующий очередь фиксированного размера
// для хранения символов
class FixedQueue implements ICharQ{
    private char   q[]; //this array hold the queue
    private int putloc, getloc; //the put and ger indices

    //Construct an empty queue given its size.
    public FixedQueue(int size){
        q=new char[size]; //allocate (выделить) memory for queue
        //q=new char[size+1];
        putloc=getloc=0;
    }

    //Put a character into the queue.
    public void put (char ch){
        if (putloc==q.length){
           // if (putloc==q.length-1){
            System.out.println("- Queue is full.");
            return;
        }

        q[putloc++]=ch;
        //putloc++;
        //q[putloc]=ch;

    }

    //Get a character from the queue.
    @Override
    public char get() {
        if (getloc==putloc){
            System.out.println("- Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
        //getloc++;
        //return q[getloc];
    }
}

//A circular queue - Кольцевая очередь.
class CircularQueue implements ICharQ {
    private char q[];   //the array hold queue
    private int putloc, getloc; //the put and ger indices

    //Construct an empty queue given its size.
    public CircularQueue(int size){
        q=new char[size+1]; //allocate (выделить) memory for queue
        putloc=getloc=0;
    }

    //Put a character into the queue.
    public void put (char ch){
/*Queue is full if either putloc is one less (на единицу меньше)
than getloc, or if putloc is at the end of the array and getloc
is at the beginning. */
        if (putloc+1==getloc| ((putloc==q.length-1)&(getloc==0))){
            System.out.println("- Queue is full.");
            return;
        }

        putloc++;
        if (putloc==q.length) putloc=0; //loop back-перейти в начало массива
        q[putloc]=ch;
    }

    //Get a character from the queue.
    public char get(){
        if (getloc==putloc){
            System.out.println("- Queue is empty.");
            return (char)0;
        }

        getloc++;
        if (getloc==q.length)getloc=0;  //loop back-вернуться в начало очереди
        return q[getloc];
    }
}

class CircularQueueE implements ICharQ {
    private char q[];   //the array hold queue
    private int putloc, getloc; //the put and ger indices

    //Construct an empty queue given its size.
    public CircularQueueE(int size){
        q=new char[size+1]; //allocate (выделить) memory for queue
        putloc=getloc=0;
    }

    //Put a character into the queue.
    public void put (char ch){
/*Queue is full if either putloc is one less (на единицу меньше)
than getloc, or if putloc is at the end of the array and getloc
is at the beginning. */
        if (putloc+1==getloc| ((putloc==q.length-1)&(getloc==0))){
            System.out.println("- Queue is full.");
            return;
        }

        q[putloc++]=ch;
        if (putloc==q.length) putloc=0; //loop back-перейти в начало массива
        }

    //Get a character from the queue.
    public char get(){
        if (getloc==putloc){
            System.out.println("- Queue is empty.");
            return (char)0;
        }

        char ch=q[getloc++];
        if (getloc==q.length)getloc=0;  //loop back
        return ch;
    }
}

//A dynamic queue
class DynQueue implements ICharQ{
    private char q[];   //the array hold queue
    private int putloc, getloc; //the put and ger indices

    //Construct an empty queue given its size.
    public DynQueue(int size){
        q=new char[size]; //allocate (выделить) memory for queue
        //In russian version: q=new char[size+1]
        putloc=getloc=0;
    }

    //Put a character into the queue.
    public void put (char ch){
        if (putloc==q.length){  //In russian version: 'putloc==q.length-1'
            //increase (увеличить) queue size
            char t[]=new char[q.length*2];

            //copy elements into new queue
            for (int i = 0; i < q.length; i++)
                t[i]=q[i];

                q=t;
        }

        q[putloc++]=ch; //In russian version: putloc++; q[putloc]=ch;
    }

    //Get a character from the queue.
    public char get(){
        if (getloc==putloc){
            System.out.println("- Queue is empty.");
            return (char)0;
        }

        return q[getloc++]; //In russian version: getloc++; return q[getloc];
    }
}

//Demonstrate the ICharQ interface.
public class IQDemo {
    public static void main(String[] args) {
        FixedQueue q1=new FixedQueue(10);
        DynQueue q2=new DynQueue(5);
        CircularQueue q3=new CircularQueue(5);
        CircularQueueE q4=new CircularQueueE(5);

        ICharQ iQ;

        char ch;
        int i;

        iQ=q1;
        //Put some characters into fixed queue.
        for (i = 0;  i<10 ; i++)
            iQ.put((char)('A'+i));

        //Show the queue.
        System.out.print("Contents of fixed queue: ");
        for (i = 0;  i<10 ; i++){
          ch=iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ=q2;
        //Put some characters into dynamic queue.
        for (i = 0;  i<10 ; i++)
            iQ.put((char)('Z'-i));

        //Show the queue.
        System.out.print("Contents of dynamic queue: ");
        for (i = 0;  i<10 ; i++){
            ch=iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ=q3;
        //Put some characters into circular queue.
        for (i = 0;  i<5 ; i++)
            iQ.put((char)('A'+i));

        //Show the queue.
        System.out.print("Contents of circular queue: ");
        for (i = 0;  i<5 ; i++){
            ch=iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        //Put more characters into circular queue.
        for (i =5; i <10 ; i++)
            iQ.put((char)('A'+i));

        //Show the queue.
        System.out.print("Contents of circular queue: ");
        for (i = 0;  i<5 ; i++){
            ch=iQ.get();
            System.out.print(ch);
        }

        System.out.println("\nStore and consume from "+
        "circular queue.");//Coxpaнeниe и использование данных кольц. очереди

        //Store in and consume from circular queue.
        //Поместить символы в кольцевую очередь и извлечь их оттуда
        for (i = 0; i < 10; i++) {
            iQ.put((char)('A'+i));
            ch=iQ.get();
            System.out.print(ch);
        }
    }
}
