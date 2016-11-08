/**
 * Created by Оксана on 31.10.2016.
 */
//Character(знак; символ; цифра; буква) variables can be
// handled (обрабатывать; оперировать, манипулировать) like integers (целое число).
public class CharArithDemo {
    public static void main(String[] args) {
        char ch;
         ch='X';
        System.out.println("ch contains " + ch);

        ch++; //increment ch - a char can be incremented
        System.out.println("ch is now " + ch);

        ch=90; //give ch a value Z -
                // a char can be assignted (присвоено) an integer value
        System.out.println("ch is now " +ch);
    }
}
