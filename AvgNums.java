/**
 * Created by Оксана on 17.01.2017.
 */

/*This program averages a list of numbers entered.
Данная программа находит среднее арифметическое для
ряда чисел, введенных пользователем с клавиатуры.
 */
import java.io.*;
public class AvgNums {
    public static void main(String[] args)
    throws IOException
    {
     //Create a BufferedReader using System.in
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n;
        double sum=0.0;
        double avg,t;

        System.out.print("How many numbers will you enter: ");
        str=br.readLine();
        try {
            n=Integer.parseInt(str); //Convert string to int-Преобр-е строки в числ.зн-е типа int
        }
        catch (NumberFormatException exc){
            System.out.println("Invalid format"); //Heвepный формат
            n=0;
        }

        System.out.println("Enter " + n + " values.");
        for (int i = 0; i <n ; i++) {
            System.out.print(": ");
            str=br.readLine();
            try {
                t=Double.parseDouble(str); //Convert string to double
            }
            catch (NumberFormatException exc) {
                System.out.println("Invalid format");
                t=0.0;
            }
            sum+=t;
        }
        avg=sum/n;
        System.out.println("Average is " + avg);
    }
}
