/**
 * Created by RUSLAN77 on 26.07.2016.
 */

// Location tag is important
public class Break6 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        //Here is the label to the operator for
        stop1:
        for (x = 0; x < 5; x++) {
            for (y = 0; y < 5; y++) {
                if (y == 2) break stop1;
                System.out.println("x and y: " + x + " " + y);
            }
        }
        System.out.println();

        // A label is located here just before   opening brace

        for (x = 0; x < 5; x++)
            stop2:{
                for (y = 0; y < 5; y++) {
                    if (y == 2) break stop2;
                    System.out.println("x and y: " + x + " " + y);
                }
            }

    }
}