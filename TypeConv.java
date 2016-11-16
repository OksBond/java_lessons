/**
 * Created by Оксана on 16.11.2016.
 */
/*Automatic type conversions can affect
overloaded method resolution - Автоматическое
преобразование типов может влиять
на выбор перегружаемого метода.
 */
class Overload2 {
    void f(int x) {
        System.out.println("Inside f(int): " + x);
    }

void f (double x){
    System.out.println("Inside f(double): "+x);
}
}

public class TypeConv {
    public static void main(String[] args) {
        Overload2 ob=new Overload2();

        int i=10;
        double d=10.1;

        byte b=99;
        short s=10;
        float f=11.5F;

        ob.f(i);    //calls ob.f(int) - no type conversion
        ob.f(d);    //calls ob.f(double)

        ob.f(b);    //calls ob.f(int) - type conversion
        ob.f(s);    //calls ob.f(int) - type conversion
        ob.f(f);    //calls ob.f(double) - type conversion
    }
}
