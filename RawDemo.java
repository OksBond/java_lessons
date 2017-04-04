/**
 * Created by Оксана on 22.02.2017.
 */

//Demonstrate a raw type.
public class RawDemo {
    public static void main(String[] args) {

        //Create a Gen object for Integer.
        Gen<Integer> iOb=new Gen<Integer>(88);

        //Create a Gen object for Strings.
        Gen<String> strOb=new Gen<String>("Generics Test");

        //Create a raw-type Gen object and give it a Double value.
        Gen raw=new Gen(new Double(98.6));
        //When no type argument is supplied, a raw type is created.
        //Если аргумент типа не предост., создается базовый тип

        //Cast here is necessary because type is unknown.
        //Здесь требуется приведение типов, так как тип неизвестен
        double d=(Double) raw.getOb();
        System.out.println("value: " + d);

        /*The use of a raw type can lead to run-time.exception.
        Here are some examples.
        Исп-е базового типа может привести к искл-ям времени
        выполнения. Примеры ниже.*/

        /* The following cast causes a run-time error!
        След. приведение типов вызывает ошибку времени вьmолнения!*/
//        int i=(Integer) raw.getOb();    //run-time error

        //This assignment overrides(отменять,отвергать) type safety.
        //Это присваивание нарушает безопасность типов
        strOb=raw;  //OK, but potentially wrong
        //допустимо, но потенциально неверно; безоп-ть баз. типов не проверяется
//      String str=strOb.getOb();   //run-time error

        //This assignment also overrides type safety.
        // След. присваивание также нарушает безоп-ть типов
        raw=iOb;    //OK, but potentially wrong
//      d=(Double) raw.getOb(); //run-time error
    }
}

