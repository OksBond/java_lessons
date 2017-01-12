package qpack;

/*Try This 9.1
Adding exceptions to the Queue class
 */

//An exception for queue-full errors.
class QueueFullException extends Exception {
    int size;

    QueueFullException (int s){size=s;}

    public String toString(){
        return "\nQueue is full. Maximum size is " +
                size;
    }
}

//An exception for queue-empty errors.
class QueueEmptyException extends Exception {

    public String toString (){
        return "\nQueue is empty.";
    }
}

//A fixed-size queue class for characters.
//Класс, реализующий очередь фиксированного размера
// для хранения символов
class FixedQueue2 implements ICharQ2{
    private char   q[]; //this array hold the queue
    private int putloc, getloc; //the put and ger indices

    //Construct an empty queue given its size.
    public FixedQueue2(int size){
        q=new char[size]; //allocate (выделить) memory for queue
        //q=new char[size+1]; RU
        putloc=getloc=0;
    }

    //Put a character into the queue.
    public void put (char ch)
    //2)
            throws QueueFullException{

        if (putloc==q.length)
            //2)
            throw new QueueFullException(q.length);

        // if (putloc==q.length-1){ RU
        //2) System.out.println("- Queue is full.");
        //2)return;

        q[putloc++]=ch;
        //putloc++; RU
        //q[putloc]=ch; RU
    }

    //Get a character from the queue.
    @Override
    public char get()
    //2)
            throws QueueEmptyException{

        if (getloc==putloc)
            //2)    System.out.println("- Queue is empty.");
            //2)    return (char) 0;
            throw new QueueEmptyException();

        return q[getloc++];
        //getloc++; RU
        //return q[getloc]; RU
    }
}

//Demonstrate the queue exceptions.
public class QExcDemo {
    public static void main(String[] args) {
        FixedQueue2 q = new FixedQueue2(10);
        char ch;
        int i;

        try {
            //overrun the queue - Переполнение очереди
            for (i = 0; i < 11; i++) {
                System.out.print("Attemping to store: " +
                        (char) ('A' + i)); //"Пoпыткa сохранения: "
                q.put((char) ('A' + i));
                System.out.println(" - OK");
            }
            System.out.println();
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            //over-empty the queue - Попытка извлечь символ из пустой очереди
            for (i = 0; i < 11; i++) {
                System.out.print("Getting next char: ");
                //"Пoлyчeниe очередного символа: ";
                ch = q.get();
                System.out.println(ch);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}



