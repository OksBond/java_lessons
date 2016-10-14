/**
 * Created by Оксана on 14.10.2016.
 */
//Search an array using for-each style for
    //Поиск в массиве с исп-ем расшир. цикла for
public class Search {
    public static void main(String[] args) {
        int nums[]= {6,3,7,5,6,1,4};
        int val=5;
        boolean found=false;

        //Use for-each style for to search nums for val.
        //Исп-ть цикл for-each для поиска значения пер. val в массиве nums
        for (int x:nums){
            if (x==val){
                found=true;
                break;
            }
        }
        if (found)
            System.out.println("Value found!/Знaчeниe найдено!");
    }
}
