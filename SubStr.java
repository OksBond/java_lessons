/**
 * Created by Оксана on 18.10.2016.
 */
//Use substring() - Применение метода substring()
public class SubStr {
    public static void main(String[] args) {
        String orgstr="Java make the Web move.";

        //construct a substring - Сформировать подстроку
        String substr=orgstr.substring(5,18);
        //this creates a new string that contains the desired substring
        //Здесь создается новая строка, содержащая нужную подстроку

        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}
