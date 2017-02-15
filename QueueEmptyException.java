/**
 * Created by Оксана on 15.02.2017.
 */

//An exception for queue-empty errors - Искл-е, указ-е на исчерпание очереди
public class QueueEmptyException extends Exception{
    public String toString (){
        return "\nQueue is empty.";
    }
}
