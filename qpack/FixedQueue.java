package qpack;

/**
 * Created by Оксана on 13.12.2016.
 */

//A fixed-size queue class for characters.
    //Класс, реализующий очередь фиксированного размера
// для хранения символов
public class FixedQueue implements ICharQ{
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
