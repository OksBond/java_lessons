/**
 * Created by Оксана on 19.11.2016.
 */
//Use a static block
    class StaticBlock {
    static double rootOf2;
    static double rootOf3;

    static {    //this block is executed when the class is loaded
        System.out.println("Inside static block");
        rootOf2=Math.sqrt(2.0);
        rootOf3=Math.sqrt(3.0);
    }

    StaticBlock(String msg){
        System.out.println(msg);
    }
}

public class SDemo3 {
    public static void main(String[] args) {
        StaticBlock ob=new StaticBlock("Inside Constructor");

        System.out.println("Square root of 2 is " + //Кв. корень
        StaticBlock.rootOf2);
        System.out.println("Square root of 3 is " + //Кв. корень
                StaticBlock.rootOf3);
    }
}
