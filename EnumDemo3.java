/**
 * Created by Оксана on 30.01.2017.
 */

//Use an enum constructor, instance variable and method.
enum Transport3 {CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);
//Notice the initialization values - Обратить внимание на способ инициализации констант

    //Add an instance variable.
private int speed;  //typical speed of each transport$

    //Add a constructor
    Transport3(int s){speed=s;}

    //Add a method
    int getSpeed(){return speed;}
}

public class EnumDemo3 {
    public static void main(String[] args) {
        Transport3 tp;

        //Display speed of an airplane.
        System.out.println("Typical speed for an airplane is " +
        Transport3.AIRPLANE.getSpeed() + //Obtain(получение, опр-е) the speed by calling getSpeed()
        " miles per hour.\n");

        //Display all Transports and speeds.
        System.out.println("All Transport speesd: ");
        for (Transport3 t:Transport3.values())
            System.out.println(t + " typical speed is "+
            t.getSpeed()+ " miles per hour.");
    }
}
