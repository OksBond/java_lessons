/**
 * Created by Оксана on 02.12.2016.
 */

//A superclass reference can refer to a subclass object.
//Обращение к объекту подкл. по ссылочной переменной суперкласса.
class X1 {
    int a;

    X1(int i) {
        a = i;
    }
}

class Y1 extends X1 {
    int b;

    Y1(int i, int j) {
        super(j);

        b = i;
    }
}

public class SupSubRef {
    public static void main(String[] args) {
        X1 x = new X1(10);
        X1 x2;
        Y1 y = new Y1(2,5);

        x2 = x;   //OK, both of same type
        System.out.println("x2.a: " + x2.a);

        x2=y;   //still Ok because Y is derived from X;
        // Y us a subclass of X; thus x2 can refer to y.
        System.out.println("x2.a: " + x2.a);

        //X references know only about X members
        x2.a=19;    //OK
        //x2.b=27;  //Error, X doesn't have a b member
    }
}
