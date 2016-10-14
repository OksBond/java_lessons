/**
 * Created by Оксана on 14.10.2016.
 */
//The for-each loop is essentially read-only
//Циклы for-each предназн. только для чтения
public class NoChange {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x : nums) {
            System.out.print(x + " ");
            x = x * 10;  //no effect on nums
            //операция не изм. содержимое массива nums
        }
        System.out.println();

        for (int x : nums)
            System.out.print(x + " ");

        System.out.println();
    }
}
