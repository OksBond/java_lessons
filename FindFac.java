/**
 * Created by RUSLAN77 on 27.07.2016.
 */

//определяется ряд множителей на которые данное число делится без остатка.
//It is determined by a number of factors on which a given number is divisible

public class FindFac {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            System.out.print("Dividers (Делители) " + i + ": ");
            for (int j = 2; j < i; j++)
                if ((i % j) == 0) System.out.print(j + " ");
            System.out.println();
        }
    }
}

//В качествеупражнения попробуйте сделать данную программу более эффективной. (Подсказка:
//  число итераций во внутреннем цикле можно уменьшить.)?????