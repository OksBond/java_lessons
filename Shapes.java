/**
 * Created by Оксана on 26.11.2016.
 */

//A simple class hierarchy. A class for two-dimentional objects.
//Простая иерархия классов. Класс, описывающий двумерные объекты.
class TwoDShape {
    double width;
    double height;

    void showDim() {
        System.out.println("Width and height are " +
                width + " and " + height);
    }
}

//A subclass (подкласс) of TwoDShape for triangles (треугольников).
class Triangle extends TwoDShape {   //Triangle inherits TwoDShape.
    String style;

    double area() {
        return width * height / 2;
    }   //Triangle can refer (обращаться, ссылаться) to the members of TwoDShape
    // as if they were part of Triangle.

    void showStyle() {
        System.out.println("Triangle " + style);
    }

    //A subclass of TwoDShape for rectangles (прямоугольников).
    class Rectangle extends TwoDShape{
        boolean isSquare(){
            if (width==height)return true;
            return false;
        }
        double area (){
            return width*height;
        }
    }
}

public class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.width = 4.0;   //All members of Triangle are available to Triangle
        t1.height = 4.0;  //objects, even those inherited from TwoDShape.
        t1.style = "filled"; //filled - закрашенный, заполненный
        //Объектам типа Triangle доступны все члены кл. Triangle,
        //даже те, которые унаследованы от класса TwoDShape

        t2.width = 8.0;
        t2.height=12.0;
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
