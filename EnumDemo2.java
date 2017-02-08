/**
 * Created by Оксана on 30.01.2017.
 */

//Use the built-in enumeration methods.
//Использование встроенных методов перечислений.

//An enumeration of Transport varieties.
//enum Transport {CAR, TRUCK, AIRPLANE, TRAIN, BOAT}

public class EnumDemo2 {
    public static void main(String[] args) {
        Transport tp;

        System.out.println("Here are all Transport constants"); //"Koнcтaнты Transport:"

        //use values(). Obtain an array of Transport constants.
        Transport allTransports[]=Transport.values(); //Получить массив констант типа Transport.
        for (Transport t :allTransports)
            System.out.println(t);
        //Компактная версия цикла for-each - нет необх-ти испо-ть доп. переменную allTransports.
//        for (Transport2 t:Transport2.values())
//            System.out.println(t);

        System.out.println();

        //use valueOf(). Obtain the constant with the name AIRPLANE.
        tp=Transport.valueOf("AIRPLANE");
        System.out.println("tp contains " + tp);
    }
}
