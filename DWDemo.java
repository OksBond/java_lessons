/**
 * Created by RUSLAN77 on 16.07.2016.
 */
// Demonstrate cycle do-while
class DWDemo {
    public static void main(String args[])
            throws java.io.IOException{
    char ch;
    do {
        System.out.print("Press the desired key, and then press <ENTER>: ");
            ch = (char) System.in.read(); // get a character from the keyboard
        } while(ch != 'q');

    }
}


