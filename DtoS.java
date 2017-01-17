/**
 * Created by Оксана on 17.01.2017.
 */

/*A simple disk-to-screen utility that demonstrates a FileReader.
Пример простой утилиты для чтения данных с диска и вывода их
на экран, демонстрирующий использование класса FileReader.
 */
import java.io.*;

public class DtoS {
    public static void main(String[] args) {
        String s;

        //Create and use a FileReader wrapped in a BufferedReader.
        //Создать и исп-ть объект FileReader, помещенный в оболочку на основе кл.BufferedReader
        try (BufferedReader br= //Create a FileReader - Созжание объекта FileReader.
                     new BufferedReader(new FileReader("test.txt")))
        {
            while ((s=br.readLine())!=null){ //Read lines from the file and display them on the screen
                System.out.println(s);
            }
        }catch (IOException exc){
            System.out.println("I/O Error: " + exc);
        }
    }

    /*!!! для потока FileReader создается оболочка на основе класса BufferedReader.
   Бл. этому появл. возм-ть обращаться к методу readLine (}. Кр.т., закрытие потока типа
   BufferedReader, на кот.в дан. пр-ре ссылается переменная br, авт-ки приводит к закрытию файла.
   */
}
