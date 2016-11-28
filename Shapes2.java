/**
 * Created by Оксана on 27.11.2016.
 */

//Use accessor methods fo set (установки) and get(получения) private members.
// A class for two-dimentional objects.
class TwoDShape2 {
    private double width;   // this are now private
    private double height;

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
class Triangle2 extends TwoDShape2 {
    String style;

    double area() { //Use accessor methods provided
        // (предусмотренный, обеспеченный) by superclass
        return getWidth() * getHeight()/ 2;
    }

    void showStyle() {
        System.out.println("Triangle " + style);
    }
        }

public class Shapes2 {
    public static void main(String[] args) {
        Triangle2 t1 = new Triangle2();
        Triangle2 t2 = new Triangle2();

        t1.setWidth1(4.0);
        t1.setHeight(4.0);
        t1.style = "filled"; //filled - закрашенный, заполненный

        t2.setWidth1(8.0);
        t2.setHeight(12.0);
        t2.style="outlined"; //outlined - контурный, очерченный, обрисованный.

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
