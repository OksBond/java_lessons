/**
 * Created by Оксана on 12.01.2017.
 */

/*This version of the ShowFile program uses a try-with-resources
statement to automatically close a file when it is no longer needed.;
В этой версии программы ShowFile оператор try с ресурсами
прим-ся для авт-го закрытия файла, когда в нем
больше нет необходимости.
 */

import java.io.*;

public class ShowFile3 {
    public static void main(String[] args) {
        int i;

        //First make sure that a file has been specified.
//        if (args.length != 1) {
//            System.out.println("Usage: ShowFile Filename");
//            //System.out.println ("Иcnoльзoвaниe: ShowFile имя_файла");
//            return;
//   }

        //The following code uses try-with-resources to open a file
        //and then automatically close it when the try block is left(покинут).
        try (FileInputStream fin = new FileInputStream("F://IT 18.09.16//lessons//src//TEST.TXT")) {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
