/**
 * Created by Оксана on 01.04.2017.
 */

/*Use the same functional interface with three different lambda expressions.
Исп-е одного и того же функц. и-фейса с тремя разл. лямбда-выражениями.
 */

/*A functional interface that takes two int parameters and returns a boolean result.
Функц. и-фейс принимает два пар-ра типа iпt и возвращает рез-т типа boolean.
 */
interface NumericTest {
    boolean test(int n, int m);
}

public class LambdaDemo2 {
    public static void main(String[] args) {
        /*This lambda expression determines if one number is a factor of another.
        Данное Л-В проверяет, кратно ли одно число другому
         */
        NumericTest isFactor = (n, d) -> (n % d) == 0;
        //Use the same functional interface with three different lambda expressions.

        if (isFactor.test(10, 2))
            System.out.println("2 is a factor of 10");
        if (!isFactor.test(10, 3))
            System.out.println("3 is not a factor of 10");
        System.out.println();

        /*This lambda expression returns true, if the first argument
        is less than second.
        Данное Л-В возвращает true, если первый аргумент меньше второго.
         */
        NumericTest lessThan = (n, m) -> (n < m);
        //Use the same functional interface with three different lambda expressions.

        if (lessThan.test(2, 10))
            System.out.println("2 is less than 10");
        if (!lessThan.test(10, 2))
            System.out.println("10 is not less than 2");
        System.out.println();

        /*This lambda expression returns true if the absolute values
        of the arguments are equal.
        Данное Л-В возвращает true, если оба аргумента равны по абс. величине
         */
        NumericTest absEqual = (n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);

        if (absEqual.test(4, -4))
            System.out.println("Absolute values of 4 and -4 are equal.");
        if (!absEqual.test(4, -5))
            System.out.println("Absolute values of 4 and -5 are not equal.");
        System.out.println();
    }
}
