/**
 * Created by Оксана on 12.01.2017.
 */

/*This variation wraps the code that opens and
accesses the file within a single try block.
The file is closed by the finally block.
В этой версии программы те ее части, которые отвечают
за открытие файла и получение доступа к нему, помещены
в один блок try. Файл закрывается в блоке finally.
 */

import java.io.*;

public class ShowFile2 {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null; //Here, 'fin' is initialezed to null.

        //First, confirm that a file name has been specified.
//        if (args.length != 1) {
//            System.out.println("Usage: ShowFile filename");
//            //System.out.println ("Иcnoльзoвaниe: ShowFile имя_файла");
//            return;
//        }

        //The following code opens a file, reads characters untill EOF (end of file)
        //is encountered, and then closes the file via a finally block.
        try {
            fin = new FileInputStream("F://IT 18.09.16//lessons//src//TEST.TXT");

            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (FileNotFoundException exc) {
            System.out.println("File Not Found");
        } catch (IOException exc) {
            System.out.println("An I/O Error Occurred.");
            //System.out.println("Oшибкa ввода-вывода");
        } finally {
            //Close file in all cases.
            try {
                if (fin != null) fin.close(); //Close 'fin' only if it is not null.
            } catch (IOException exc) {
                System.out.println("Error closing file.");
            }
        }
    }
}
/*!!!переменная fin инициализируется значением null.В блоке finally файл закрывается
только, если значение переменной fin не равно null. Это будет работать, т.к. переменная
fin не =null только, если файл был успешно открыт. Т.о., если при открытиифайла
возникнет искл-е, метод close () не будет вызываться.
Блок try/catch м.б. более компактным.Т.к. искл-е FileNotFoundException явл. подкл. искл-я
IOException, его не нужно перехватывать отдельно.
Н-р, блок catch для перехвата обоих типов искл-й, избегая независимого перехвата искл-я
FileNotFoundException. В д.сл. выводится станд. сообщение о возникшем искл-и с описанием ошибки.
...
} catch (IOException exc) {
           System.out.println("Oшибкa ввода-вывода" + exc);
        } finally {
...
 */