import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Оксана on 12.01.2017.
 */

/*Display a text file.
To use this program, specify the name of the file that
you want to see. For example, to see a file called
TEST.TXT, use the following command line.
java ShowFile TEST.TXT
Отображение текстового файла.
При вызове этой программы следует указать имя файла,
содержимое которого требуется просмотреть.
Например, для вывода на экран содержимого файла TEST.TXT
необходимо ввести в командной строке следующую команду:

java ShowFile TEST.TXT
*/
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        //First make sure that a file has been specified.
        //Прежде убедитесь, что пр-ме передается имя файла.
//        if (args.length != 1) {
//            System.out.println("Usage: ShowFile File");
//            //System.out.println ("Иcnoльзoвaниe: ShowFile имя_файла");
//            return;
//        }

        try {
            fin = new FileInputStream("F://IT 18.09.16//lessons//src//TEST.TXT"); //Open the file
       //fin = new FileInputStream(args[0]); ТАК в книге, но так не работает!!!
        } catch (FileNotFoundException exc) {
            System.out.println("File Not Found");
            return;
        }

        try {
            //read bytes untill EOF is encountered
            //Читать байты, пока не встретится символ EOF
            do {
                i = fin.read(); //Read from the file
                if (i != -1) System.out.print((char) i);
            } while (i != -1); //When i equals -1, the end
            // of the file has been reached.
        } catch (IOException exc) {
            System.out.println("Error reading file.");
            //System.out.println("Oшибкa при чтении файла");
        } finally { //Close file on the way out of the try block.
            //Для закрытия файла используется блок finally
            try {
                fin.close(); //Use a finally clause to close the file.
            } catch (IOException exc) {
                System.out.println("Error closing file.");
            }
        }
    }
}