/**
 * Created by Оксана on 25.10.2016.
 */
//Lowercase letters.
//Преобразование прописных букв английского алфавита в строчные
public class LowCase {
    public static void main(String[] args) {
        char ch;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);

            //This statement turns on the 6th bit.
            ch = (char) ((int) ch | 32); //ch is now lowercase (строчная)

            System.out.print(ch + " ");
        }
    }
}
