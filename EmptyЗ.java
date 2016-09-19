/**
 * Created by RUSLAN77 on 16.07.2016.
 */
// The body of the for loop can be empty- in this example, to produce the sum of numbers from 1 to 5
class EmptyЗ {
    public static void main(String args[]){
    int i;
    int sum = 0;
    for (i=1; i<=5; sum+= i++);
        System.out.println("Sum: "+sum);
}
}
//  sum+= i++   EQUAL:
//  sum = sum + i;
//   i++;

