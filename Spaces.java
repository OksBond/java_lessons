import java.io.IOException;

/**
 * Created by RUSLAN77 on 01.09.2016.
 */
//Counting spaces  Подсчет пробелов
public class Spaces {
    public static void main(String[] args) throws IOException {
         {  char ch;
            int spaces=0;
            System.out.println("To stop, enter a dot");
            do {
                ch=(char) System.in.read();
                if (ch==' ') spaces++;
                } while (ch!='.');
            System.out.println("Spaces:"+ spaces);
        }
    }
}
