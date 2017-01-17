package excpack;

/**
 * Created by Оксана on 24.12.2016.
 */
//Use multi-catch feature (особенность;).
// Использование средства группового перехвата исключений.
public class MultiCatch {
    public static void main(String[] args) {
        int a=88, b=0;
        int result;
        char chrs[]={'A','B','C'};

        for (int i = 0; i < 2; i++) {
            try {
                if (i==0)
                    result=a/b; //generate an ArithmeticException
                else
                    chrs[5]='X';    //generate an ArrayIndexOutOfBoundsException

                //This catch clause catches both exceptions.
            }
            catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
                System.out.println("Exception caught: "+ e);
            }
        }
        System.out.println("After multi-catch.");
    }
}