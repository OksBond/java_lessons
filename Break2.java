/**
 * Created by RUSLAN77 on 17.07.2016.
 */
// Reading input data until received until the letter q
class Break2 {
    public static void main(String args[])
            throws java.io.IOException {
        char ch;
        for (; ; ) {
            ch = (char) System.in.read();// get a character from the keyboard
            if (ch == 'q') break;
        }
            System.out.println("You pressed a key q!");
        }
    }
