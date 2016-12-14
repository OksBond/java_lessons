/**
 * Created by Оксана on 14.12.2016.
 */

//One interface can extend another - Наследование интерфейсов
    interface A4{
    void meth1();
   void meth2();
}

//'B' now includes meth1() and meth2 - it adds meth3().
interface B4 extends A4{ //B inherits A.
    void meth3();
}

//This class must implement all of A and B
class MyClass2 implements B4{
    public void meth1(){
        System.out.println("Implement meth1().");
    }

    public void meth2(){
        System.out.println("Implement meth2().");
    }

    public void meth3(){
        System.out.println("Implement meth3().");
    }
}

public class IFExtend {
    public static void main(String[] args) {
        MyClass2 ob=new MyClass2();

        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
