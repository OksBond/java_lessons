package excpack;

/**
 * Created by Оксана on 17.12.2016.
 */

//Manually throw an exception.
public class ThrowDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Before throw.");
            throw new ArithmeticException(); //Throw an exception.
            }
            catch (ArithmeticException exc){
                //catch the exception
                System.out.println("Exception caught.");
            }
        System.out.println("After try/catch block.");
    }
}
