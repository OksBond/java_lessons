/**
 * Created by RUSLAN77 on 16.07.2016.
 */
// Skipping individual components in the definition of the for loop
class Empty {
    public static void main(String args[]) {
        int i;
        for (i = 0; i < 10; ) {
            System.out.println("Пpoxoд #" + i);
            i++; // increment the loop variable
        }
    }
}