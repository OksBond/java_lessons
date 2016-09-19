/**
 * Created by RUSLAN77 on 17.07.2016.
 */
// The use of the break statement to exit the loop
class BreakDemo {
    public static void main(String args[]) {
        int num;
        num = 100;
        // Perform loop as long as the square of the value of the variable i is less than the value of num
        for (int i = 0; i < num; i++) {
            if (i * i >= num) break; // To terminate the cycle if i*i >= 100
            System.out.print(i + " ");
        }
        System.out.println("The cycle is complete.");
    }
    }