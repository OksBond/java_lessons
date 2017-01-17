/**
 * Created by Оксана on 17.01.2017.
 */

//Use a BufferedReader to read characters from the console (класс BufferedReader)
import java.io.*;

public class ReadChars {
    public static void main(String[] args) throws IOException
    {
        char c;
        BufferedReader br=//Create BufferedReader linked to System.in
                new BufferedReader (new InputStreamReader(System.in));
        //Создание объекта BufferedReader, связанного с потоком System.in

        System.out.println("Enter characters, period to quit.");
        //period(в д.сл.-точка) to quit(в д.сл.-оставлять, покидать) - окончание ввода - символ точки


        //read characters
        do {
            c=(char) br.read();
            System.out.println(c);
        } while (c!='.');
    }
}
