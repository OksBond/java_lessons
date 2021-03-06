package qpack;

/**
 * Created by Оксана on 16.12.2016.
 */
public class CircularQueueE implements ICharQ {
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
