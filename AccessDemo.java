/**
 * Created by Оксана on 08.11.2016.
 */

//Public vs private access
class MyClass {
    private int alpha; // закрытый доступ
    public int beta; // открытый доступ
    int gama;   //default access - тип доступа по умолч. (по сути public)

    /*Methods to access alpha. It is OK for a
    member of a class to access a private member
    of the same class. - Методы доступа к
    переменной alpha. Члены класса могут обращаться
    к закрытым членам того же класса.
     */
    void setAlpha(int a){
        alpha=a;
    }

    int getAlpha(){
        return alpha;
    }
}

public class AccessDemo {
    public static void main(String[] args) {
        MyClass ob=new MyClass();

        /*Access to alpha is allowed only through
         its accessor methods. - Доступ к переменной
         alpha возможен только с помощью специально
         предназначенных для этой цели методов.
          */
        ob.setAlpha(-99);
        System.out.println("ob.alpha: "+ ob.getAlpha());

        //You cannot access alpha like this:
        //ob.alpha=10; //Wrong! alpha is private!

        //These are OK because beta and gamma are public
        ob.beta=88;
        ob.gama=99;
    }
}
