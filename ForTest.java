/**
 * Created by RUSLAN77 on 16.07.2016.
 */
// The loop as long as the keypad will not enter the letter S
class ForTest {
    public static void main(String args[])
            throws java.io.IOException {
        int i;
        System.out.println("To stop, press the S key");
        for (i = 0; (char) System.in.read() != 'S'; i++)
            System.out.println("Пpoxoд #" + i);
    }
}