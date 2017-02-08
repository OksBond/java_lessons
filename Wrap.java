/**
 * Created by Оксана on 05.02.2017.
 */

//Demonstrate manual boxing and unboxing with a type wrapper.
public class Wrap {
    public static void main(String[] args) {
        Integer iOb=new Integer(100);   //Manually box the value 100

        int i =iOb.intValue();  //Manually unbox the value in iOb.

        System.out.println(i + " " + iOb);  //display 100 100
    }
}
