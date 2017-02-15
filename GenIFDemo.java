/**
 * Created by Оксана on 15.02.2017.
 */

//A generic interface example.
/*A generic containment interface.
This interface implies that an implementing class
contains one or more values.
Подраз-ся, что класс, реализующий этот интерфейс,
содержит одно или неск. зн-й.
*/
interface Containment<T> { //a generic interface
    /*The contains() method tests if a specific item
    is contained within an object that implements Containment.
    Метод contains() проверяет, содержится ли некот. эл-т в
    объекте класса, реализующего интерфейс Containment.
    */
    boolean contains(T o);
}

/*Implement Containment using an array to hold the values.
Реализовать интерфейс Containment с помощью массива,
предназначенного для хранения значений.
*/
class MyClass4<T> implements Containment<T> {
    T[] arrayRef;   //Любой кл., реал-й обобщ. интерфейс, д.б. обобщенным
    //Any class that implements a generic interface must itself be generic.

    MyClass4(T[] o) {
        arrayRef = o;
    }

    //Implement contains()
    //Реализовать метод contains()
    public boolean contains(T o) {
        for (T x : arrayRef)
            if (x.equals(o)) return true;
        return false;
    }
}

public class GenIFDemo {
    public static void main(String[] args) {
        Integer x[] = {1, 2, 3};

        MyClass4<Integer> ob = new MyClass4<Integer>(x);

        if (ob.contains(2))
            System.out.println("2 is in ob");
        else
            System.out.println("2 is NOT in ob");

        if (ob.contains(5))
            System.out.println("5 is in ob");
        else
            System.out.println("5 is NOT in ob");

        /*The following is illegal because ob is an
        Integer Containment and 9.25 is a Double value.
        Следующие строки кода недопустимы, т.к. объект оЬ
        явл. вариантом реал-и интерфейса Containment для
        типа Integer, а зн-е 9.25 относится к типу DouЫe.
        */
//        if (ob.contains(9.25))  //Illegal!
//            System.out.println("9.25 is in ob");
    }
}
