/**
 * Created by Оксана on 17.11.2016.
 */
/*Try this 6-2
An queue class for characters.-
Класс, реализующий очередь для хранения символов.
 */

class Queue2 {

    private char q[]; //this array hold the queue - массив для хран. эл-тов очереди
    private int putloc, getloc; //the put and get indices - индексы для вставки
    //и извлечения элементов очереди

    //Construct an empty Queue2 given its size
    //Сконструировать пустую очередь заданного размера
    Queue2(int size) {
        q = new char[size]; //allocate memory for queue -
        //выделить память для очереди
        putloc = getloc = 0;
    }

    //Construct a Queue2 from a Queue2
    //Конструктор, созд. один объект типа Queue2 на основе другого
    Queue2(Queue2 ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        //Copy elements - Копировать элементы очереди
        for (int i = getloc; i < putloc; i++)
            q[i] = ob.q[i];
    }

    //Construct  a Queue2 with initial values.
    //Конструирование и инициализация объекта типа Queue
    Queue2(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length + 1];

        for (int i = 0; i < a.length; i++)
            put(a[i]);
    /*В силу особенностей алгоритма, реализующего очередь, длина
очереди должна быть на один элемент больше, чем длина
исходного массива.
*/
    }


    //put a character into the queue -  поместить символ в очередь
    void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Очередь заполнена/Queue is full.");
            return;
        }

        q[putloc++] = ch;
    }

    //get a character from the queue - извлечь символ из очереди
    char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста/Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }
}

//Демонстрация использования класса Queue
public class QDemo2 {
    public static void main(String[] args) {
        //construct 10-element empty queue
        Queue2 q1 = new Queue2(10);

        char name[] = {'T', 'o', 'm'};
        //construct queue from array
        Queue2 q2 = new Queue2(name);

        char ch;
        int i;

        //put some characters into q1
        //Поместить букв. символы в очередь q1
        for (i = 0; i < 10; i++)
            q1.put((char) ('A' + i));

        //Construct a queue from a queue
        Queue2 q3 = new Queue2(q1);

        //Show the queues
        System.out.println("Contents of q1: ");
        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.println("Contents of q2: ");
        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.println("Contents of q3: ");
        for (i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }
}

