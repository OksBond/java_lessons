/**
 * Created by Оксана on 08.05.2017.
 */

//Use the Predicate built-in functional interface.
//Использование встроенного функционального интерфейса Predicate.
    //Import the Predicate interface.
    import java.util.function.Predicate;

public class UsePredicateinterface {
    public static void main(String[] args) {
        /*This lambda expression uses Predicate<Integer> to
        determine if a number is even.
        Данное лямбда-выражение использует интерфейс
        Predicate<Integer> для определения того, четно ли
        заданное число         */
        Predicate<Integer> isEven=(n)->(n%2)==0; //Use the built-in interface.

        if (isEven.test(4)) System.out.println("4 is even");

        if (!isEven.test(5)) System.out.println("5 is odd");
    }
}
