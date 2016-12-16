/**
 * Created by Оксана on 14.12.2016.
 */

//Implement MyIF.
class MyIFImp implements MyIF{
    /*Only getUserID() defined by MyIF needs to be implemented.
    getAdminID() can be allowed to default.
    Реализации подлежит лишь метод getUserID() интерфейса MyIF.
Делать это для метода getAdminID() необязательно, т.к. м.б.
использована его реализация, заданная по умолчанию.*/
    public int getUserID(){
        return 100;
    }
}

class MyIFImp2 implements MyIF{
    /*Here, implementations for both getUserID( ) and
    getAdminID( ) are provided.
    Предост. реализации обоих методов - getUserID() и getAdminID()*/
    public int getUserID(){
        return 100;
    }

    public int getAdmin(){
        return 42;
    }
}

//Use the default method.
public class DefaultMethodDemo {
    public static void main(String[] args) {

        MyIFImp obj=new MyIFImp();
        int uID=MyIF.getUniversalID();//(2) to call a static method


        /*Can call getUserID(), because it is explicitly
        (недвусмысленно, явно) implemented by MyIFImp:
        Вызов метода getUserID() возможен, т.к. он явно
реализован классом MyIFimp*/
        System.out.println("User ID is "+ obj.getUserID());
        //User ID - Идeнтификaтop пользователя

        /*Can also call getAdminID(), because of default implementation.
        Вызов метода getAdminID() также возможен, т.к.
предоставляется его реализация по умолчанию
        */
        System.out.println("Admin ID is "+ obj.getAdminID());
        //Admin ID - Идeнтификaтop администратора
    }
}
