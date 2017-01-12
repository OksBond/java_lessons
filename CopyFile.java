/**
 * Created by Оксана on 12.01.2017.
 */

/*Copy a text file.
To use this program, specity the nameof the source file and
the destination file. For example, to copy a file called
TEST.TXT to a file called TEST2.TXT, use the following
command line: java CopyFile TEST.TXT TEST2.TXT
Копирование текстового файла.
При вызове этой программы следует указать имена исходного
и целевого файлов. Например, для копирования файла FIRST.TXT
в файл SECOND.TXT в командной строке нужно ввести следующую
команду: java CopyFile TEST.TXT TEST2.TXT
 */

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin=null;
        FileOutputStream fout=null;

        //First make sure that both files has been specified.
        //Прежде убедитесь, что пр-ме передаются имена обоих файлов
//        if (args.length!=2){
//            System.out.println("Usage: CopyFile from to");
//            //System.out.println("Иcпoльзoвaниe: CopyFile откуда куда");
//            return;
//        }

        //Copy a File
        try {
            //Attempt to optn the files.
            fin=new FileInputStream("F://IT 18.09.16//lessons//src//TEST.TXT");
            fout=new FileOutputStream("F://IT 18.09.16//lessons//src//TEST2.TXT");

            do {
                i=fin.read(); //Read bytes from one file
                if (i!=-1) fout.write(i); //and write them to another.

            }while (i!=-1);
            System.out.println("File is copied");
        } catch (IOException exc){
            System.out.println("I/O Error: " + exc);
        } finally {
            try {
                if (fin !=null) fin.close();
            } catch (IOException exc){
                System.out.println("Error Closing Input File.");
            }
            try {
                if (fout!=null)fout.close();
            } catch (IOException exc){
                System.out.println("Error Closing Output File.");
            }
        }
    }
}
