/**
 * Created by Оксана on 16.01.2017.
 */

/*Try This 10.1
Compare two files.
To use this program, specify the names
of the files to be compared on the command line.
java CompFile FIRST.TXT SECOND.TXT

При вызове этой программы следует указать имена
сравниваемых файлов. Например, чтобы сравнить файл
FIRST.TXT с файлом SECOND.TXT, в командной строке
нужно ввести следующую команду:
java CompFiles FIRST.TXT SECOND.TXT
 */

import java.io.*;
public class CompFiles {
    public static void main(String[] args) {
        int i=0, j=0;

        //First make sure that both files have been specified.
//        if (args.length!=2){
//            System.out.println("Usage: CompFiles f1 f2");
//            //System.out.println("Иcпoльзoвaниe: CompFiles f1 f2");
//            return;
//        }

        //Compare the files.
        try(FileInputStream f1=new FileInputStream("F://IT 18.09.16//lessons//src//FIRST.TXT");
        FileInputStream f2=new FileInputStream("F://IT 18.09.16//lessons//src//SECOND.TXT")) {
            //...=new FileInputStream(args[0]); ТАК в книге, но не работает!!!

            //Check the contents of each file.
            do {
                i=f1.read();
                j=f2.read();
                if (i!=j) break;
            }while (i!=-1 && j!=-1);

            if (i!=j)
                System.out.println("Files differ.");
            else
                System.out.println("Files are the same.");
        } catch (IOException exc){
            System.out.println("I/O Error: " + exc);
        }
    }
}
