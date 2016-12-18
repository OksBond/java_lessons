package excpack;

/**
 * Created by Оксана on 18.12.2016.
 */

//Rethrow an exception. - Повторное генерирование исключения.
class Rethrow {
    public static void genException() {
        //Here, numer is longer than denom.
        int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + "/" +
                        denom[i] + " is " + numer[i] / denom[i]);
            } catch (ArithmeticException exc) {
                //catch the exception
                System.out.println("Can't divide by Zero!");
            } catch (ArrayIndexOutOfBoundsException exc) {
                //catch the exception
                System.out.println("No matching element found.");
                //Cooтвeтcтвyющий элемент не найден
                throw exc; //rethrow the exception.
            }
        }
    }
}

public class RethrowDemo {
    public static void main(String[] args) { //Catch rethrown exception.
        //Перехват повторно сгенерированного исключения
        try {
            Rethrow.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            //recatch exception - Повторно перехватить исключение
            System.out.println("Fatal error - program terminated.");
        }
    }
}
