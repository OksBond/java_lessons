package qpack;

/**
 * Created by Оксана on 11.01.2017.
 */

//A character queque interface
//that throws exceptions.
public interface ICharQ2 {
    //Put a character into the queue.
    void put (char ch) throws QueueFullException;

    //Get a character from the queue.
    char get() throws QueueEmptyException;
}
