/**
 * Created by Оксана on 15.02.2017.
 */

//A generic queue interface.
public interface IGenQ <T> {
    //Put an item into the queue.
    void put (T ch) throws QueueFullException;

    //Get an item from the queue.
    T get()throws QueueEmptyException;
}
