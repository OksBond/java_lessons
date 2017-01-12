/**
 * Created by Оксана on 12.01.2017.
 */

/*A version of CopyFile that uses try-with-resorces.
It demonstrates two resources (in this case files) being
managed by a single try statement.
Версия программы CopyFile, в которой используется оператор
try с ресурсами. В ней демонстрируется управление двумя ресурсами
(в данном случае - файлами) с помощью единственного оператора try.
 */

import java.io.*;

public class CopyFile2 {
    public static void main(String[] args) throws IOException {
int i;

        //First, confirm that both files has been specified.
//        if (args.length!=2){
//            System.out.println("Usage: CopyFile from to");
//            //System.out.println("Иcпoльзoвaниe: CopyFile откуда куда");
//            return;
//        }

        //Open and manage two files via the try statement.
        try (FileInputStream fin = new FileInputStream("F://IT 18.09.16//lessons//src//TEST.TXT");
             FileOutputStream fout=new FileOutputStream("F://IT 18.09.16//lessons//src//TEST2.TXT"))
                //Manage two resources
        {
            do {
                i=fin.read(); //Read bytes from one file
                if (i!=-1) fout.write(i); //and write them to another.
            }while (i!=-1);
            System.out.println("File is copied");
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
