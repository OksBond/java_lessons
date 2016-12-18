package excpack;

/**
 * Created by Оксана on 17.12.2016.
 */

//Let JVM handle the error - Обработка ошибки средствами JVM
public class NotHandled {
    public static void main(String[] args) {
        int nums[]=new int[4];

        System.out.println("Before exception is generated.");

        //Generate an index out-of-bounds exception.
        nums[7] = 10;
    }
}
