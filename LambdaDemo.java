/**
 * Created by Оксана on 13.03.2017.
 */

//Demonstrate two simple lambda expressions.

//A functional interface.
interface MyValue {
    double getValue();
}

//Another a functional interface.
interface MyParamValue {
    double getValue(double v);
}

public class LambdaDemo {
    public static void main(String[] args) {
        MyValue myVal;  //declare an interface reference

        /*Here, the lambda expression is a constant expression.
        When it is assingned (присвоено) to myVal, a class instance is
        constructed in which the lambda expression implements
        the getValue() in MyValue.
        Здесь лямбда-выражение - это просто константа. При его назн-и
        переменной myVal создается экземпляр класса, в кот.
        лямбда-выражение реализует метод getValue() интерфейса MyValue.
        */
        myVal = () -> 98.6; //A simple lambda expression.

        /*Call getValue(), which is provided by the previously
        assingned lambda expression.
        Вызвать метод getValue(), предоставляемый ранее
        назначенным лямбда-выражением.
         */
        System.out.println("A constant value: " + myVal.getValue());

        /*Now, create a parameterized lambda expression and assing it to
         a MyParamValue reference. This lambda expression returns
         the reciprocal of its argument.
        Создать параметризованное лямбда-выражение и назначить его
        ссылке на экземпляр MyParamValue. Это лямбда-выражение
        возвращает обратную величину своего аргумента.
         */
        MyParamValue myPval=(n)->1.0/n; //A lambda expression that has a parameter

        //Call getValue(v) through the myPval reference.
        //Вызвать метод getValue(v) посредством ссылки myPval.
        System.out.println("Reciprocal of 4 is " + myPval.getValue(4.0));
        System.out.println("Reciprocal of 8 is " + myPval.getValue(8.0));

        /*A lambda expression must be compatible with the method
        defined by the functional interface. Therefore, these won'twork:
        Лямбда-выражение д.б. совместимым с методом, кот. опр-ся функц. интерфейсом.
        Поэтому приведенные ниже два фрагмента кода не будут работать.
         */
        //myVal=()->"three";  //Error! String not compatible with double!
        //Ошибка! Тип String несовместим с типом douЬle!
        //myPval=()-> Math.random();  //Error! Parameter required!
        // Ошибка! Требуется параметр!

    }
}
