/**
 * Created by RUSLAN77 on 06.06.2016.
 */
public class КeyboardIn {
    public static void main(String[] args) throws java.io.IOException{
        char ch;
        System.out.print("Press the desired key, and then\n" +
                "ENTER key:");
        ch=(char) System.in.read(); // get the symbol
        System.out.println("You pressed a key "+ch);


    }
}

