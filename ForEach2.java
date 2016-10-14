/**
 * Created by Оксана on 14.10.2016.
 */
/*Use for-each style for on a two-dimensional array. -
Исп-е разновидности for-each цикла for для обработки двумерного массива
 */
public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int nums[][]=new int[3][5];

        //give nums some value - ввести ряд значений в массив nums
        for (int i=0; i<3; i++)
            for (int j = 0; j<5; j++)
                nums[i][j]=(i+1)*(j+1);

        //Use for-each for loop to display and sum the value
        for (int x[]:nums){ //Notice how x is declared
            //Обратите внимание на способ объявления переменной х
            for (int y:x){
                System.out.println("Value is: " + y);
                sum+=y;
            }
            System.out.println();
        }
        System.out.println("Summation:" + sum);
    }
}
