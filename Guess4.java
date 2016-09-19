/**
 * Created by RUSLAN77 on 16.07.2016.
 */
//The game of guessing the letters, the fourth version
class Guess4 {
    public static void main(String args[])
            throws java.io.IOException {
        char ch, ignore, answer = 'S';
        do {
            System.out.println("Have the intention a letter from the range A-Z.");
            System.out.print("Try to guess it: ");
// Get a character from the keyboard
            ch = (char) System.in.read();
// Discard all other characters in the input buffer
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer) System.out.println("** Correctly! **");
            else {
                System.out.print(" ... Sorry, the desired letter is ");
                if (ch < answer)
                    System.out.println("towards the end of the alphabet");
                else System.out.println("closer to the beginning of the alphabet");
                System.out.println("Try again\n");
            }
            }
            while (answer != ch) ;
        }
    }
