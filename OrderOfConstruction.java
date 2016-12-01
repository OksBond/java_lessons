/**
 * Created by Оксана on 01.12.2016.
 */

//Demonstrate when constructors are executed.
//Демонстрация очередности вызова конструкторов.

    //Create a super class.
    class A1{
    A1(){
        System.out.println("Constructing A.");
    }
}

//Create a subclass by extending class A.
class B1 extends A1{
    B1(){
        System.out.println("Constructing B.");
    }
}

//Create another subclass by extending B.
class C1 extends B1{
    C1(){
        System.out.println("Constructing C.");
    }
}

public class OrderOfConstruction {
    public static void main(String[] args) {
        C1 c=new C1();
    }
}
