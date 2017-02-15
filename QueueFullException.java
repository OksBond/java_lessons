/**
 * Created by Оксана on 15.02.2017.
 */

//An exception for queue-full errors - Искл-е, указ-е на переполнение
public class QueueFullException extends Exception {
    int size;

    QueueFullException (int s){ size=s; }

    public String toString(){
        return "\nQueue is full. Maximum size is " + size;
    }
}
