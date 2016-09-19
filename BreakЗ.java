/**
 * Created by RUSLAN77 on 17.07.2016.
 */
// The use of the break statement in the nested loops
class BreakЗ {
    public static void main(String args[]) {
        for (int i = 0; i < 3; i++) {
            System.out.println("The counter of the outer loop: " + i);
            System.out.print("Inner loop counter");
            int t = 0;
            while (t < 100) {
                if (t == 10) break; // interrupt cycle if t = 10
                System.out.print(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("Cycles are completed");
    }
}