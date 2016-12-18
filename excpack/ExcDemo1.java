package excpack;

/**
 * Created by Оксана on 16.12.2016.
 */

//Demonstration exception handling(обработка).
public class ExcDemo1 {
    public static void main(String[] args) {
        int nums[] = new int[4];

        try {   //Create a try block.
            System.out.println("Before exception is generated."); //Дo
            //генерации исключения

            //Generate an index out-of-bounds exception.
            //Попытка использовать индекс, выходящий за границы массива.
            nums[7] = 10; //Attempt to index past nums boundary.
            System.out.println("this won't be displayed");
        } catch (ArrayIndexOutOfBoundsException exc) { //Catch array boundary errors.
            //catch the exception
            System.out.println("Index out-of-bounds!"); //Bыxoд за границы массива!
        }
        System.out.println("After catch statement.");
    }
}
