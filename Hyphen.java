/**
 * Created by Оксана on 18.01.2017.
 */

/*Chapter 10 Self Test
Copy a text file, substituting hyphens for spaces.
This version uses byte streams(потоки).
To use this program, specify the name of the source(исходный) file
and the destination(целевой) file.
Копирование текстового файла с заменой пробелов дефисами.
В этой версии программы используются байтовые потоки.
Для того чтобы воспользоваться этой программой, укажите
в командной строке имена исходного и целевого файлов. Например:
java Hyphen source target
 */

import java.io.*;
public class Hyphen {
    public static void main(String[] args) {
        int i;
        FileInputStream fin=null;
        FileOutputStream fout=null;

        //Make sure that both files has been specified.
        if (args.length!=2){
            System.out.println("Usage: Hyphen from to ");
            return;
        }

        //Copy file and substitute(заменить) hyphens(дефисы).
        try {
            fin=new FileInputStream(args[0]);
            fout=new FileOutputStream(args[1]);

            do {
                i=fin.read();
                //convert space to a hyphen - преобразовать пробел в дефис
                if ((char)i==' ') i='-';

                if (i!=-1) fout.write(i);
            }while (i!=-1);
        } catch (IOException exc){
            System.out.println("I/O Error: "+exc);
        }finally {
            try {
                if (fin!=null) fin.close();
            } catch (IOException exc){
                System.out.println("Error Closing Input File.");
            }

            try {
                if (fin!=null) fout.close();
            } catch (IOException exc){
                System.out.println("Error Closing Output File.");
            }
        }
    }
}
