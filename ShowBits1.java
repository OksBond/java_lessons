/**
 * Created by Оксана on 25.10.2016.
 */
//Display the bits within a byte.
    //Отображение битов, составляющих байт
public class ShowBits1 {
    public static void main(String[] args) {
        int t;
        byte val;

        val=123;
        for (t=128; t>0; t=t/2){
            if ((val&t)!=0) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
}
