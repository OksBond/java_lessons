/**
 * Created by Оксана on 15.02.2017.
 */

//A generic, fixed-size queue class - Обобщ. кл/, реал-й очередь фикс. размера
public class GenQueue<T> implements IGenQ<T> {
    private T q[];  //this array holds the queue
    //массив для хран. элементов очереди
    private int putloc, getloc; //the put and get indices
    //индексы вставки и извлечения элементов очереди

    //Construct an empty queue with the given array (из заданного массива)
    public GenQueue(T[] aRef){
        q=aRef;
        putloc=getloc=0;
    }

    //Put an item into the queue
    public void put(T obj)
            throws QueueFullException {

        if (putloc==q.length)
            throw new QueueFullException(q.length);

        q[putloc++]=obj;
    }

    //Get a character from the queue.
    public T get()
        throws QueueEmptyException{

        if (getloc==putloc)
            throw new QueueEmptyException();

        return q[getloc++];
    }
}
