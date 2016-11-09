/**
 * Created by Оксана on 09.11.2016.
 */
/*This class implements (реализует) a "fail-soft"
(fail - отказ, неудача) array which prevents
В этом классе реализуется "отказоустойчивый" массив,
предотвращающий ошибки времени выполнения
*/
class FailSoftArray {
    private int a[]; //reference to array - ссылка на массив
    private int errval; //value to return if get() fail
    //значение, возвращаемое в случае
    // возникновения ошибки при выполнении
    // метода get ()
    public int length; //length is public - открытая переменная length

    /*Construct array given its size and the value to return if get()
    fails. - Конструктору данного класса передается размер массива и
    значение, которое должен возвращать метод get() при
    возникновении ошибки.*/
    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errval = errv;
        length = size;
    }

    //Return value at given index -
    // Возвратить значение элемента массива с заданным индексом
    public int get(int index) {
        if (indexOK(index)) return a[index];
        return errval;
    }

    // Put a value at an index. Return false on failure.
    // Установить значение элемента с заданным индексом.
// Если возникнет ошибка, возвратить логическое значение false.
    public boolean put(int index, int val) {
        if (indexOK(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }

    //Return true if index is within bounds.
    // Вернуть логическое значение true, если индекс
// не выходит за границы массива
    private boolean indexOK(int index) {
        if (index >= 0 & index < length) return true;
        return false;
    }
}

//Demonstrate the fail-soft array.
// Демонстрация работы с "отказоустойчивым" массивом
public class FSDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        //show quiet failures
        // Демонстрация корректной обработки ошибок
        System.out.println("Fail quietly/Oбpaбoткa ошибок без вывода отчета.");
        for (int i = 0; i < (fs.length * 2); i++)
            fs.put(i, i * 10); //Access to array must be through its accessor methods

        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);

            if (x != -1) System.out.print(x + " ");
        }
        System.out.println(" ");

        //now, handle failures
        //Обработать ошибки
        System.out.println("\nFail with error reports/Обработка ошибок с выводом отчета");
        for (int i = 0; i < (fs.length * 2); i++)
            if (!fs.put(i, i * 10))
                System.out.println("Index " + i + " out-of-bounds");

        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);

            if (x != -1) System.out.print(x + " ");
            else
                System.out.println("Index " + i + " out-of-bounds");
        }
    }
}
