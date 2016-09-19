/**
 * Created by RUSLAN77 on 16.07.2016.
 */
// Declaring a variable in the loop for
class ForVar {
    public static void main(String args[]) {
        int sum = 0;
        int fact = 1;
// Calculating the factorial of numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            sum += i; // the variable i is available throughout the cycle
            fact *= i;
// However, the variable i is not available here
            System.out.println("Sum: " + sum);
            System.out.println("Factorial: " + fact);
        }
    }
}
