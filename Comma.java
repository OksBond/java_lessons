/**
 * Created by RUSLAN77 on 16.07.2016.
 */
// The use of commas in the for loop
class Comma {
    public static void main(String args[]) {
        int i, j;
        for (i = 0, j = 10; i < j; i++, j--)
            System.out.println("i и j: " + i + " " + j);
    }
}
