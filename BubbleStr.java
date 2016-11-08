/**
 * Created by Оксана on 08.11.2016.
 */

public class BubbleStr {
    public static void main(String[] args) {
       String str[]={"this", "is", "a", "test","of","a","string","sort"};
        //int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int a, b;
        String t;
        //int size;

        //size = 10; //количество сортируемых элементов

        //Отобразить исходный массив
        System.out.print("Исходный массив: ");
        for (int i = 0; i < str.length; i++)
            System.out.print(" " + str[i]);
        System.out.println();

        //Реализовать алгоритм пузырьковой сортировки
        for (a =1; a < str.length; a++)
            for (b = str.length-1; b >= a; b--) {
                if (str[b - 1].compareTo(str[b]) >0 ) {
                    //если требуемый порядок не соблюдается
                    //поменять элементы местами
                    t = str[b - 1];
                    str[b - 1] = str[b];
                    str[b] = t;
                }
            }

        //Отобразить отсортированный массив
        System.out.print("Отсортированный массив: ");
        for (int i=0; i<str.length; i++)
            System.out.print(" " + str[i]);
        System.out.println();
    }
}
