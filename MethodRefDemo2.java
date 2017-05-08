/**
 * Created by Оксана on 05.05.2017.
 */

/*Use a method reference to a instance method.
Использование ссылки на метод экземпляра.
 */

/*A functional interface for numeric predicates that
operate on integer values.
Функц. и-фейс для числ. предикатов, которые
воздействуют на целочисленные значения
Исп-ся и-фейс, как и для MethodRefDemo.java*/

/*This class stores a int value and defines the instance
method isFactor(), which returns true if its argument is
a factor of the stored value.
Данный класс хранит значение типа int и определяет метод
isFactor(), который возвращает значение true, если его аргумент
является делителем числа, хранящегося в классе */
class MyIntNum{
    private int v;

    MyIntNum (int x){v=x;}
    int getNum(){return v;}

    //Return true if n is a factor of v.
    boolean isFactor (int n){
        return (v%n)==0;
    }
}

public class MethodRefDemo2 {
    public static void main(String[] args) {
        boolean result;

        MyIntNum myNum=new MyIntNum(12);
        MyIntNum myNum2=new MyIntNum(16);

        //Here, a method reference to isFactor on myNum is created.
        // Создать ссылку ip на метод isFactor объекта myNum.
        IntPredicate ip=myNum::isFactor; //A method reference to an instance method


        //Now, it is used to call isFactor() via test().
        //Исп-ть ссылку для вызова метода isFactor() через метод test().
        result=ip.test(3);
        if (result) System.out.println("3 is a factor of " + myNum.getNum());

        /*This time, a method reference to isFactor on myNum2 is created
        and used to call isFactor() via test().
        Создать ссылку на метод isFactor для объекта myNum2 и исп-ть ее
        для вызова метода isFactor() через метод test()    */
        ip=myNum2::isFactor;
        result=ip.test(3);
        if (!result) System.out.println("3 is not a factor of " + myNum2.getNum());
    }
}
