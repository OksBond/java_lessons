/**
 * Created by Оксана on 08.11.2016.
 */
//Улучшенный вариант программы шифрования сообщений
    //с помощью операции поразрядного исключающего ИЛИ
public class Encode1 {
    public static void main(String[] args) {
        String msg="This is a test";
        String encmsg="";
        String decmsg="";
        String key="abcdefgi";
        int j;

        System.out.print("Исходное сообщение: ");
        System.out.println(msg);

        //зашифровать сообщение
        j=0;
        for (int i = 0; i <msg.length() ; i++) {
            encmsg=encmsg+ (char)(msg.charAt(i)^key.charAt(j));
            j++;
            if (j==8) j=0;
                    }

        System.out.print("Зашифрованное сообщение: ");
        System.out.println(encmsg);

        //дешифровать сообщение
        j=0;
        for (int i = 0; i <msg.length() ; i++) {
            decmsg=decmsg+ (char)(encmsg.charAt(i)^key.charAt(j));
                    j++;
            if (j==8) j=0;
                    }

        System.out.print("Дешифрованное сообщение: ");
        System.out.println(decmsg);
    }
}
