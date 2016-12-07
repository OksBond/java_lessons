/**
 * Created by Оксана on 05.12.2016.
 */

/*В оба класса, TwoDShape и Triangle, добавлены конструкторы,
принимающие объект своего класса в качестве параметра.
 */
class TwoDShape7 {
    private double width;
    private double height;

    //A default constructor.
    TwoDShape7(){
        width=height=0.0;
    }

    //Parameterized constructor.
    TwoDShape7(double w, double h) {
        width = w;
        height = h;
    }

    //Construct object with equal width and height.
    TwoDShape7(double x){
        width=height=x;
    }

    //Constructor an object from an object.
    TwoDShape7(TwoDShape7 ob){
        width=ob.width;
        height=ob.height;
    }

    //Accessor methods for width and height.
    double getWidth(){return width;}
    double getHeight(){return height;}
    void setWidth1(double w){width=w;}
    void setHeight(double h){height=h;}

    void showDim() {
        System.out.println("Width and height are " +
                width + " and " + height);
    }
}

//A subclass (подкласс) of TwoDShape for triangles (треугольников).
class Triangle7 extends TwoDShape7{
    private String style;

    //A default constructor.
    Triangle7(){
        super();
        style="none";
    }

    //Constructor for Triangle.
    Triangle7(String s, double w, double h) {
        super(w, h);  //call superclass constructor

        style = s;
    }

    //One argument constructor.
    Triangle7(double x){
        super(x);   //call superclass constructor

        style="filled";
    }

    //Construct an object from an object.
    Triangle7(Triangle7 ob){
        super(ob);  //Pass object (a Triangle reference)
        // to TqoDShape constructor.
        style=ob.style;
    }

    double area() {
        return getWidth() * getHeight()/ 2;
    }

    void showStyle() {
        System.out.println("Triangle " + style);
    }
}

public class Shapes7 {
    public static void main(String[] args) {
        Triangle7 t1 = new Triangle7("outlined", 8.0,12.0);

        //make a copy of t1
        Triangle7 t2=new Triangle7(t1);

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is "+ t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is "+ t2.area());
    }
}
