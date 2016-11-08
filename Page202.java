/**
 * Created by Оксана on 06.11.2016.
 */
//Chapter 5 Self Test
//Вопросы н упражнения для самоnроверкн
public class Page202 {
    public static void main(String[] args) {

        double num[] = new double[12];
        double[] num1 = new double[12];

        /*альтернативная форма объявления массива;
         Н-р, удобна для объявления нескольких массивов одного типа

       int []num2=new int{1,2,3,4,5};
       */
        double nums[] = {1.0, 3.0, 5.0, 2.0, 4.0, 2.0};
        double sum = 0;

        for (int i = 0; i < nums.length; i++)
            sum += nums[i];

        System.out.println("Total sum: " + sum);
        System.out.println("Avrige value: " + sum / nums.length);
    }
}

