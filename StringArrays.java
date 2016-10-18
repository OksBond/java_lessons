import java.util.StringTokenizer;

/**
 * Created by Оксана on 18.10.2016.
 */
//Demonstrate String arrays - Демонстрация использования массивов строк
public class StringArrays {
    public static void main(String[] args) {
        String strs[]={"This", "is", "a", "test." };

        System.out.println("Original array: "); //"Иcxoдный массив: "
        for (String s:strs )
            System.out.print(s + " ");
        System.out.println("\n");

        //Change a string - Изменить строку
        strs[1]="was";
        strs[3]="test, too!";

        System.out.println("Modified array: "); //"Измeнeнный массив: "
        for (String s:strs)
            System.out.print(s + " ");
    }
}
