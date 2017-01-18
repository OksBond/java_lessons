/**
 * Created by Оксана on 18.01.2017.
 */

/*Try This 10.2
A help program that uses a disk file to store help information.
Справочная система, использующая дисковый файл
для хранения информации
 */

import java.io.*;

/*The Help class opens a help file, searches for a topic,and
then display the information associated (связанный) with that topic.
Notice that it handles all I/O exceptions itself, avoiding the need
for calling code to do so.
В классе Help открывается файл со справочной информацией,
производится поиск указанной темы, а затем отображается
справочная информация. Обратите внимание на то, что данный
класс обрабатывает все исключения, освобождая от этого
вызывающий код.
 */
class Help4 {
    String helpfile;    //name of help file

    Help4 (String fname){
        helpfile=fname;
    }

    //Display help on a topic - Отобразить справ. инф-ю по указанной теме
    boolean helpon (String what){
        int ch;
        String topic, info;

        //Open the help file
        try (BufferedReader helpRdr=new BufferedReader(new FileReader(helpfile)))
        {
            do {
                //Read characters until a # is found-Читать символы, пока не встретится символ #
                ch=helpRdr.read();

                //now, see if topics match - Проверить, совпадают ли темы
                if (ch=='#'){
                    topic=helpRdr.readLine();
                    if (what.compareTo(topic)==0){  //found topic
                        do {
                            info=helpRdr.readLine();
                            if (info!=null) System.out.println(info);
                        }while ((info!=null) &&(info.compareTo("") !=0));
                        return true;
                    }
                }
            } while (ch !=-1);
        }
        catch (IOException exc){
            System.out.println("Error accessing help file.");
            return false;
        }
        return false;   //topic not found
    }

    //Get a Help topic.
    String getSelection(){
        String topic="";

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter topic: ");  //"Yкaжитe тему:"
        try {
            topic=br.readLine();
        }
        catch (IOException exc){
            System.out.println("Error reading console.");
        }
        return topic;
    }
}

//Demonstrate the file-based (на основе файла) Help system.
public class FileHelp {
    public static void main(String[] args) {
        Help4 hlpobj=new Help4("helpfile.txt");
        String topic;

        System.out.println("Try the help system. " +
        "Enter 'stop' to end.");
        //"Bocпoльэyйтecь справочной системой. Для выхода из системы введите 'stop'.

        do {
            topic=hlpobj.getSelection();

            if (!hlpobj.helpon(topic))
                System.out.println("Topic not found.\n");

        }while (topic.compareTo("stop")!=0);
    }
}
