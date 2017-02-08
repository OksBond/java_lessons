/**
 * Created by Оксана on 07.02.2017.
 */


//An example that uses @Deprecated.

//Deprecate a class. - Пометить класс как не реком-й к прим-ю
@Deprecated     //Mark a class as deprecated. - Помечает класс кок устаревший
class MyClass3 {
    private String msg;

    MyClass3 (String m){
        msg=m;
    }

    //Deprecate a method. - Пометить метод ак не реком-й к прим-ю
@Deprecated
String getMsg(){
return msg;}
}

//...

public class AnnoDemo {
    public static void main(String[] args) {
        MyClass3 myObj=new MyClass3("test");

        System.out.println(myObj.getMsg());
    }
}
