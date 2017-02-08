/**
 * Created by Оксана on 01.02.2017.
 */
//Исп-ся перечисление из файла EnumDemo.java
//Demonstrate ordinal() and compareTo()
public class EnumDemo4 {
    public static void main(String[] args) {
        Transport tp, tp2, tp3;

        //Obtain all ordinal values using ordinal().
        System.out.println("Here sre all Transport constants" +
        " and their ordinal values: ");
        for (Transport t:Transport.values())
            System.out.println(t + " " + t.ordinal()); //Obtain ordinal values.

        tp=Transport.AIRPLANE;
        tp2=Transport.TRAIN;
        tp3=Transport.AIRPLANE;

        System.out.println();

        //Demonstrate compareTo()
        if (tp.compareTo(tp2)<0)    //Compare ordinal values.
            System.out.println(tp + " comes before " + tp2);

        if (tp.compareTo(tp2)>0)
            System.out.println(tp2 + " comes before " + tp);

        if (tp.compareTo(tp3)==0)
            System.out.println(tp+ " equals "+ tp3);
    }
}
