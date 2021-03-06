package qpack;

/**
 * Created by Оксана on 11.01.2017.
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
        //q=new char[size+1]; RU
        putloc=getloc=0;
    }

    //Put a character into the queue.
    public void put (char ch){
            if (putloc==q.length){

        // if (putloc==q.length-1){ RU
         System.out.println("- Queue is full.");
        return;}

        q[putloc++]=ch;
        //putloc++; RU
        //q[putloc]=ch; RU
    }

    //Get a character from the queue.
    @Override
    public char get(){

        if (getloc==putloc) {
            System.out.println("- Queue is empty.");
            return (char) 0;
        }

        return q[getloc++];
        //getloc++; RU
        //return q[getloc]; RU
    }
}
