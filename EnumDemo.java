/**
 * Created by Оксана on 30.01.2017.
 */

//Use enum Transport.
//An enumeration of Transport varieties.
//Объявление перечисления, представляющего разновидности трансп.средств
enum Transport {CAR, TRUCK, AIRPLANE, TRAIN, BOAT} //Declare an enumeration.

public class EnumDemo {
    public static void main(String[] args) {
        Transport tp;   //Declare a Transport reference.

        tp=Transport.AIRPLANE;  //Assign (присваивать) tp the constant AIRPLANE.

        //Output an enum value - Отобразить перечислимое значение
        System.out.println("Value of tp: " + tp);
        System.out.println();

        tp=Transport.TRAIN;

        //Compare two enum values.
        if (tp==Transport.TRAIN)    //Compare two Transport objects for aquality.
            System.out.println("tp contains TRAIN.\n");

        //Use an enum to control a switch atatement.
        switch (tp){
            case CAR:
                System.out.println("A car carries people.");
                break;
            case TRUCK:
                System.out.println("A truck carries freight.");
                break;
            case AIRPLANE:
                System.out.println("An airplane flies.");
                break;
            case TRAIN:
                System.out.println("A train runs on rails.");
                break;
            case BOAT:
                System.out.println("A boat sails on water.");
                break;
        }
    }
}
