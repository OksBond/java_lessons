/**
 * Created by Оксана on 05.10.2016.
 */
/*Упражнение 5.2 and Try this 6-1
Класс, реализующий очередь для хранения символов.
Усовершенствованный класс очереди для хранения символьных
значений. - An improved queue class for characters.
 */

class Queue {
    //these members are now private
    private char q[]; //this array hold the queue - массив для хран. эл-тов очереди
    private int putloc, getloc; //the put and get indices - индексы для вставки
    //и извлечения элементов очереди

    Queue(int size) {
        q = new char[size]; //allocate memory for queue -
        //выделить память для очереди
        putloc = getloc = 0;
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
public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Using bigQ to store the alphabet./" +
                "Использование очереди bigQ для сохранения алфавита.");
        //put some numbers into bigQ
        //Поместить букв. символы в очередь bigQ
        for (i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));

        //retrieve and display elements from bigQ
        //Извлечь буквенные символы из очереди ЬigQ и отобразить
        System.out.print("Contents of bigQ:/Содержимое очереди ЬigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("Using smallQ to generate errors./" +
                "Иcпoльзoвaниe очереди smallQ для генерации ошибок");
        // Now, use smallQ to generate some errors
        for (i = 0; i < 5; i++) {
            System.out.print("Attempting to store./Пoпыткa сохранения " +
                    (char) ('Z' - i));

            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();

        // more errors on smallQ
        // Дополнительные ошибки при обращении к очереди srnallQ
        System.out.print("Contents of smallQ:/Содержимое очереди smallQ: ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
    }
}
