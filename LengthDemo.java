/**
 * Created by Оксана on 02.10.2016.
 */
//Use the length array member

public class LengthDemo {
    public static void main(String[] args) {
        int list []=new int[10];
        int nums []= {1,2,3};
        int table [][]= {   //a variable-length table
                {1,2,3},    //таблица со строками переменной длины
                {4,5},
                {6,7,8,9}
        };
        System.out.println("A size of list: " + list.length);
        System.out.println("A size of nums: " + nums.length);
        System.out.println("A size of table: " + table.length);
        System.out.println("A size of table [0]: " + table[0].length);
        System.out.println("A size of table [1]: " + table[1].length);
        System.out.println("A size of table [2]: " + table[2].length);
        System.out.println();

        //Use length to initialize list
        for (int i=0; i< list.length; i++)  //Use length to conrol a for loop
            list[i]=i*i;

        System.out.print("Here is list: ");
        //now use length to display list
        for (int i=0; i<list.length; i++)
            System.out.print(list[i]+ " ");
        System.out.println();
    }
}
