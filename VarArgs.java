/**
 * Created by Оксана on 25.11.2016.
 */

//Demonstrate variable-length arguments
public class VarArgs {

    //vaTest() uses a vararg.
    // Метод vaTest() допускает переменное число аргументов
    static void vaTest(int... v) { //Declare a variable-length argument list.
        System.out.println("Number of args: " + v.length);
        System.out.println("Contents: ");

        for (int i = 0; i < v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);

        System.out.println();
    }

    public static void main(String[] args) {
        /*Notice how vaTest() can be called with
        a variable number of arguments.
        Метод vaTest () может вызываться с
        переменным числом аргументов*/
vaTest(10); //1 arg     Call with different numbers of arguments.
        vaTest(1,2,3);  //3 arg
        vaTest();   //no arg
    }
}