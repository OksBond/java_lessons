/**
 * Created by RUSLAN77 on 16.07.2016.
 */
// Skipping individual components in the definition of the for loop
class Empty2 {
    public static void main(String args[]) {
        int i;
        i=0;
        for (; i < 10; ) {
            System.out.println("Пpoxoд #" + i);
            i++; // инкрементировать переменную цикла
        }
    }
}