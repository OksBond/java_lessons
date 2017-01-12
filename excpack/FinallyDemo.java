package excpack;

/**
 * Created by Оксана on 19.12.2016.
 */

//Use finally.
class UseFinally {
    public static void genException(int what) {
        int t;
        int nums[] = new int[2];

        System.out.println("Receiving " + what); //Receiving - Получено
        try {
            switch (what) {
                case 0:
                    t = 10 / what; //generate div-by-zero error
                    break;
                case 1:
                    nums[4] = 4; //generate array index error.
                    break;
                case 2:
                    return; //return from try block
            }
        } catch (ArithmeticException exc) {
            //catch the exception
            System.out.println("Can't divide by Zero!");
            return; //return from catch
        } catch (ArrayIndexOutOfBoundsException exc) {
            //catch the exception
            System.out.println("No matching element found.");
        } finally {//This is executed on the vay out of try/catch blocks.
            // Этот блок вып-ся независ., к.обр. завершается блок try/catch
            System.out.println("Leaving try."); //Bыxoд из блока try
        }
    }
}

public class FinallyDemo {
    public static void main(String[] args) {
        for (int i = 0; i <3 ; i++) {
            UseFinally.genException(i);
            System.out.println();
        }
    }
}
