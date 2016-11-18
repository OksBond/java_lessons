/**
 * Created by Оксана on 18.11.2016.
 */
//Use a static variable
class StaticDemo{
    int x;  //a normal instance variable - обычная переменная экземпляра
    static int y;   //a static variable
    /*This is one copy of "y" for all objects
    to share (в д.сл. - для совместного исп-я)
     */

    //Return the sum of the instance vareable x
    //and the static variable y.
    int sum(){
        return x+y;
    }
}

public class SDemo {
    public static void main(String[] args) {
        StaticDemo ob1=new StaticDemo();
        StaticDemo ob2=new StaticDemo();

        //Each object has its own copy of an instance variable
        ob1.x=10;
        ob2.x=20;
        System.out.println("Of course, ob1.x and ob2.x "+
        "are independent.");
        System.out.println("ob1.x: "+ob1.x+
                "\nob2.x: "+ ob2.x);
        System.out.println();

        //Each object shares one copy of a static variable.
        System.out.println("The static variable y is shared.");
        StaticDemo.y=19;
        System.out.println("Set StaticDemo.y to 19");
        //Set - присваивать (начальное) значение (переменной)

        System.out.println("ob1.sum(): "+ ob1.sum());
        System.out.println("ob2.sum(): "+ ob2.sum());
        System.out.println();

        StaticDemo.y=100;
        System.out.println("Change StaticDemo.y to 100");

        System.out.println("ob1.sum(): "+ ob1.sum());
        System.out.println("ob2.sum(): "+ ob2.sum());
        System.out.println();
    }
}
