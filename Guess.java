/**
 * Created by RUSLAN77 on 06.06.2016.
 */
public class Guess {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, answer = 'S';
        System.out.println("Think the letter in the range A-Z. Guess it");
        ch = (char) System.in.read();// get a symbol from the keyboard
        if (ch == answer) System.out.println("It is Correct!");
        else {
            System.out.print("Sorry, desired letter to be");
            if (ch < answer)
                System.out.println(" near the end of the alphabet");
            else System.out.println(" near the start of the alphabet");

        }
    }
}
