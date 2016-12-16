package qpack;

/**
 * Created by Оксана on 16.12.2016.
 */ //A dynamic queue
public class DynQueue implements ICharQ{
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
