/**
 * Created by Оксана on 17.01.2017.
 */

// Read a string from console using a BufferedReader.
    import java.io.*;

public class ReadLines {
    public static void main(String[] args) throws IOException
    {
        //Create a BufferedReader using System.in
        //Создать объект типа BufferedReader, связанный с потоком System.in
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String str;

        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to quit."); //Пpизнaк конца ввода - строка 'stop'
        do {
            str=br.readLine(); ///Use readLine() from BufferedReader to read a line of text.
            System.out.println(str);
        } while (!str.equals("stop"));
    }
}
