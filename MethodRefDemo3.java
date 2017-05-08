/**
 * Created by Оксана on 08.05.2017.
 */

/*Use an instance method reference to refer to any instance.
Исп-е ссылки на метод экз-ра для обращения к любому интерфейсу.
 */

/*A functional interface for numeric predicates that operate
on an object of type MyIntNum and an integer value.
Функц. и-фейс для числовых предикатов, которые воздействуют
на объект типа MyIntNum и целочисленное значение */
interface MyIntNumPredicate {
    boolean test (MyIntNum mv, int n);
}

/*This class stores an int values and defines the instance
method isFactor(), which returns true if its argument is
a factor of the stored value.
Дан.класс хранит зн-е типа int и опр-т метод isFactor(), кот.
возвр-т true, если его аргумент явл. делителем числа,
хранящегося в классе
Исп-ся класс MyIntNum из пр-мы MethodRefDemo2*/
//class MyIntNum


public class MethodRefDemo3 {
    public static void main(String[] args) {
        boolean result;

        MyIntNum myNum=new MyIntNum(12);
        MyIntNum myNum2=new MyIntNum(16);

        //This makes inp refer to the instance method isFactor().
        // Создать ссылку inp на экземплярный метод isFactor{)
        MyIntNumPredicate inp=MyIntNum::isFactor;
        //A method reference to any object of type MyIntNum

        //The following calls isFactor() on muNum.
        // Вызвать метод isFactor () для объекта myNum
        result=inp.test(myNum, 3);
        if (result)
            System.out.println("3 is a factor of " + myNum.getNum());

        //The following calls isFactor() on myNum2.
        // Вызвать метод isFactor() для объекта myNum2
        result=inp.test(myNum2,3);
        if (!result)
            System.out.println("3 is not a factor of " + myNum2.getNum());
    }
}
