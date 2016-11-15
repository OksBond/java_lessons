/**
 * Created by Оксана on 15.11.2016.
 */
//Primitive types are passed by value
//Простые тиnы данных передаются методам по значению
public class Test {
    /*This method causes (вызывает) no change to the arguments
used in the call. - Этот метод не может изменить значения аргументов,
передаваемых ему при вызове.
*/
    void noChange(int i, int j) {
        i = i + j;
        j = -j;
    }
}

class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();

        int a = 15, b = 20;

        System.out.println("a and b before call: " + a + " " + b);

        ob.noChange(a,b);
        System.out.println("a and b after call: " + a + " " + b);
    }
}
