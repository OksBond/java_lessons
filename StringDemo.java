/**
 * Created by Оксана on 17.10.2016.
 */
//Introduce String
//Знакомство с классом String
public class StringDemo {
    public static void main(String[] args) {
        //declare string in various ways
        //Различные способы объявления строк
        String str1 = new String("Java strings are objects./B Java строки - объекты.");
        String str2 = "They are constructed various ways./Они создаются разными способами.";
        String str3 = new String(str2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
