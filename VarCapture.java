/**
 * Created by Оксана on 03.05.2017.
 */

/*An example of capturing a local variable from the enclosing scope.
Пример захвата локальной переменной из охватывающей
лямбда-выражение области видимости
 */
interface MyFunc {
    int func(int n);
}

public class VarCapture {
    public static void main(String[] args) {
        //A local variable that can be captured.
        int num = 10;

        MyFunc myLambda = (n) -> {
            //This use of num is OK. It does not modify num.
            //Такое исп-е переменной num корректно, т.к. ее зн-е не изменяется.
            int v = num + n;

            /*However, the following is illegal because it attempts
            to modify the value of num.
            Приведенная ниже инструкция некорректна, т.к. изм-ет зн-е пер. num
            */
            //num++;

            return v;
        };
        //Use the lambda. This will display 18.
        // Использование лямбды. Эта инструкция отобразит число 18.
        System.out.println(myLambda.func(8));

        /*The following line would also cause an error, because
        it would remove the effectively final ststus from num.
        Приведенная ниже строка породила бы ошибку, поскольку она
        лишает num статуса финальной переменной
         */
        //num=9;
    }
}

