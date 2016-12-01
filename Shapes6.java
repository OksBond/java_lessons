/**
 * Created by Оксана on 01.12.2016.
 */

//A multilevel hierarchy - Многоуровневая иерархия
class TwoDShape6 {
    private double width;
    private double height;

    //A default constructor.
    TwoDShape6(){
        width=height=0.0;
    }

    //Parameterized constructor.
    TwoDShape6(double w, double h) {
        width = w;
        height = h;
    }

    //Construct object with equal width and height.
    TwoDShape6(double x){
        width=height=x;
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
class Triangle6 extends TwoDShape6{
    private String style;

    //A default constructor.
    Triangle6(){
        super();
        style="none";
    }

    //Constructor
    Triangle6(String s, double w, double h) {
        super(w, h);  //call superclass constructor

        style = s;
    }

    //One argument constructor.
    Triangle6(double x){
        super(x);   //call superclass constructor

        style="filled";
    }

    double area() {
        return getWidth() * getHeight()/ 2;
    }

    void showStyle() {
        System.out.println("Triangle " + style);
    }
}

//Extend Triangle.
class ColorTriangle6 extends Triangle6{
    /*ColorTriangle inherits Triangle,
which is descended from TwoDShape, so ColorTriangle includes all members
 of Triangle and TwoDShape*/
    private String color;

    ColorTriangle6 (String c, String s, double w, double h){
        super(s, w,h);

        color =c;
    }

    String getColor(){
        return color;
    }
    void showColor(){
        System.out.println("Color is " + color);
    }
}

public class Shapes6 {
    public static void main(String[] args) {
ColorTriangle6 t1=
        new ColorTriangle6("Blue", "outlined",8.0,12.0);
        ColorTriangle6 t2=
                new ColorTriangle6("Red", "filled",2.0,2.0);

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println("Area is "+ t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();   //A ColorTriangle object can call methods
        t2.showColor(); //defined itself and its superclasses.
        System.out.println("Area is "+ t2.area());
    }
}
