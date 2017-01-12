/**
 * Created by Оксана on 12.01.2017.
 */

//Read an array of bytes from the keyboard.
//Чтение байтов с клавиатуры в массив
import java.io.*;
public class ReadBytes {
    public static void main(String[] args)
        throws IOException{
            byte data[]=new byte[10];

            System.out.println("Enter some characters.");
            System.in.read(data); //Read an array of bytes from keyboard/
            System.out.print("You entered: ");
            for (int i = 0; i <data.length ; i++)
                System.out.print((char)data[i]);
        }
    }

