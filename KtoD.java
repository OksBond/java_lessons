/**
 * Created by Оксана on 17.01.2017.
 */

/*A simple key-to-disk utility that demonstrates a FileWriter.
Пример простой утилиты для ввода данных с клавиатуры и записи их на диск,
демонстрирующий использование класса FileWriter.
Набираемый текст читается до тех пор, пока пользователь не введет слово "stop".
 */
import java.io.*;
public class KtoD {
    public static void main(String[] args) {
        String str;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter text ('stop' to quit).");

        try (FileWriter fw= new FileWriter("test.txt")) //Create a FileWriter.
        {
            do {
                System.out.print(": ");
                str=br.readLine();

                if (str.compareTo("stop")==0)break;

                str=str + "\r\n"; //add newline - добавить символы перевода строки
                fw.write(str); //Write string to the file.
            }while (str.compareTo("stop")!=0);
        } catch (IOException exc){
            System.out.println("I/O Error: " + exc);
        }
    }
}
