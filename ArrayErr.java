/**
 * Created by Оксана on 26.09.2016.
 */
//Демонстрация превышения границ массива

public class ArrayErr {
    public static void main(String[] args) {
        int sample []=new int[10];
        int i;

        //Искусственный выход индекса за границы массива
        for (i=0; i<100; i++)
            sample [i]=i;
    }
}
