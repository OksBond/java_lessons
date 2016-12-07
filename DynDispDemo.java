/**
 * Created by Оксана on 06.12.2016.
 */
//Demonstrate dynamic method dispatch.
    //Демонстрация динамической диспетчеризации методов
class Sup{
    void who() {
        System.out.println("who() in Sup");
    }
}
class Sub1 extends Sup{
    void who(){
        System.out.println("who() in Sub1");
    }
}

class Sub2 extends Sup{
    void who(){
        System.out.println("who() in Sub2");
    }
}

public class DynDispDemo {
    public static void main(String[] args) {
        Sup superOb=new Sup();
        Sub1 subOb1=new Sub1();
        Sub2 subOb2=new Sub2();

        Sup supRef;

        /*In each case, the version of who() to call is determined
        at run time of object being referred to. - В каждом из этих
        вызовов выбор версии метода who () осуществляется по типу
        объекта, на который указывает ссылка во время выполнения.*/
        supRef=superOb;
        supRef.who();

        supRef=subOb1;
        supRef.who();

        supRef=subOb2;
        supRef.who();
    }
}
