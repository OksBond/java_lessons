/**
 * Created by Оксана on 18.01.2017.
 */

/*Chapter 10 Self Test
Copy a text file, substituting hyphens for spaces.
This version uses chatacter streams(потоки).
To use this program, specify the name of the source(исходный) file
and the destination(целевой) file.
For example: java Hyphen2 source target
Копирование текстового файла с заменой пробелов дефисами.
В этой версии пр-мы исп-ся символьные потоки.
Для исп-я этой пр-мы, укажите в команд. строке имена исходного
и целевого файлов. Например:
java Hyphen2 source target
Для компиляции этого кода требуется JDK 7 или б. поздняя версия.
*/

import java.io.*;
public class Hyphen2 {
    public static void main(String[] args)
    throws IOException
    {int i;

        //Make sure that both files has been specified.
        if (args.length!=2){
            System.out.println("Usage: Hyphen from to ");
            return;
        }

        //Copy file and and substitute(заменить) hyphens(дефисы).
        //Use the try-with- resources statement.
        try (FileReader fin=new FileReader(args[0]);
        FileWriter fout=new FileWriter(args[1]))
        {
            do {
                i=fin.read();
                //convert space to a hyphen - преобразовать пробел в дефис
                if ((char)i==' ') i='-';

                if (i!=-1) fout.write(i);
            }while (i!=-1);
        } catch (IOException exc){
            System.out.println("I/O Error: "+exc);
        }
    }
}
