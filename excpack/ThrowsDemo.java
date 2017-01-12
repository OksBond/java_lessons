package excpack;

/**
 * Created by Оксана on 19.12.2016.
 */

//Use throws
public class ThrowsDemo {
    public static char prompt (String str)
        throws java.io.IOException { //Notice the throws clause (выражение, оператор)

        System.out.print(str + ": ");
        return (char)System.in.read();
    }

    public static void main(String[] args) {
        char ch;

        try {
            /*Since prompt() might throw an exception, a call to it must be
            enclosed within a try block. - В методе prompt() м.б. создано искл-е,
             его вызов следует поместить в блок 'try'.   */
            ch=prompt("Enter a letter");
        }
        catch (java.io.IOException exc) {
            System.out.println("I/O exception occurred.");//Пpoизoшлo исключение ввода-вывода (I/O)
            ch='X';
        }
        System.out.println("You pressed " + ch);
    }
}
