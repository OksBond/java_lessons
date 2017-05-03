/**
 * Created by Оксана on 03.05.2017.
 */

/*Demonstrate a method reference for a static method.
Демонстрация использования ссылок на статические методы.
 */
/*A functional interface for numeric predicates that operate
on integer values.
Функциональный интерфейс для числовых предикатов, которые
воздействуют на целочисленные значения
 */
interface IntPredicate {
    boolean test (int n);
}

/*This class defines three static methods that check
an integer against some condition.
Данный класс определяет три статических метода, которые
проверяют соответствие целого числа определенным условиям
 */
class MyIntPredicates{
    /*A static method that returns true if a number is prime.
    Статический метод, который возвращает true, если
    заданное число простое.     */
    static boolean isPrime (int n){
        if (n<2)return false;
        for (int i = 2; i <n/i; i++) {
            if ((n%i)==0)
                return false;
        }
        return true;
    }

    /*A static method that returns true if a number is even.
    Статический метод, который возвращает true, если
    заданное число четное.     */
    static boolean isEven (int n){
        return (n%2)==0;
    }

    /*A static method that returns true if a number is positive.
    Статический метод, который возвращает true, если
    заданное число положительное.     */
    static boolean isPositive (int n){
        return n>0;
    }
}

public class MethodRefDemo {
    /*This method has a functional interface as the type of its
    first parameter. Thrus, it can be passed a reference to any
    instance of that interface, including one created by a
    method reference.
    В дан. методе типом первого пар-ра явл. функц. и-фейс. Сл-но,
    ему можно передать ссылку на любой экз-р этого и-фейса, в т.ч.
    и на экз-р, созданный посредством ссылки на метод.     */
    static boolean numTest (IntPredicate p, int v){
        return p.test(v);
    }

    public static void main(String[] args) {
        boolean result;

        /*Here, a method reference to isPrime() is passed to numTest().
        Здесь методу numTest() передается ссылка на метод isPrime().   */
        result=numTest(MyIntPredicates::isPrime, 17);
        if (result) System.out.println("17 is prime.");

        /*Next, a method reference to isEven is used.
        Здесь методу numTest() передается ссылка на метод isEven().    */
        result=numTest(MyIntPredicates::isEven, 12);
        if (result) System.out.println("12 is even.");

        /*Now, a method reference to isPositive is passed.
        Здесь методу numTest() передается ссылка на метод isPositive().  */
        result=numTest(MyIntPredicates::isPositive, 11);
        if (result) System.out.println("11 is positive.");
    }
}
