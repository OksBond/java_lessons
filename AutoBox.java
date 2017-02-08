/**
 * Created by Оксана on 05.02.2017.
 */

//Demonstrate autoboxing/unboxing
public class AutoBox {
    public static void main(String[] args) {
         Integer iOb=100;   //Autobox abd then auto-unbox
        int i=iOb;          //the value 100

        System.out.println(i + " " + iOb);  //display 100 100
    }
}
