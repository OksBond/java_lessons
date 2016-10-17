/**
 * Created by Оксана on 17.10.2016.
 */
//Some String operations.
// Некоторые операции над строками
public class StrOps {
    public static void main(String[] args) {
        String str1 = "When it comes to Web programming, Java is #1.";
        String str2 = new String(str1);
        String str3 = "Java strings are powerful.";//"Строки Java эффективны."
        int result, idx;
        char ch;

        System.out.println("Length of str1:/Длина str1: " +
                str1.length());

        //display str1 one char at a time - Отобразить строку strl посимвольно
        for (int i = 0; i < str1.length(); i++)
            System.out.print(str1.charAt(i));
        System.out.println();
        if (str1.equals(str2))
            System.out.println("str1 equal str2/strl эквивалентна str2");
        else
            System.out.println("str1 does not equals str2");

        if (str1.equals(str3))
            System.out.println("str1 equal str3");
        else
            System.out.println("str1 does not equals str3");

        result = str1.compareTo(str3);//Result==13 - Why???
        if (result == 0)
            System.out.println("str1 and str3 are equal");
        else if (result < 0)
            System.out.println("str1 is less than str3");
        else
            System.out.println("str1 is greater than str3");

        //assing a new string to str2 - Присвоить переменной str2 новую строку
        str2 = "One Two Three One";
        idx = str2.indexOf("One");
        System.out.println("Index if first occurrence of One: " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("Index if last occurrence of One: " + idx);
    }
}
