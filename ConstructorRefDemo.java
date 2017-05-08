/**
 * Created by Оксана on 08.05.2017.
 */

//Demonstrate a Constructor reference.
// Демонстрация использования ссылок на конструкторы.

 /*MyFunc is a functional interface whose methos returns
 a MyClass reference.
 MyFunc - функц. и-фейс, метод которого возвращает
 ссылку на MyClass   */
interface MyFunc2 {
    MyClass5 func(String s);
}

class MyClass5 {
    private String str;

    //This constructor takes an argument.
    // Этот конструктор принимает аргумент
    MyClass5(String s) {
        str = s;
    }

    //This is the default constructor.
    // Это конструктор по умолчанию
    MyClass5() {
        str = "";
    }

    //...

    String getStr() {
        return str;
    }
}

public class ConstructorRefDemo {
    public static void main(String[] args) {
        /*Create a reference to the MyClass constructor.
        Because func() in MyFunc tskes an argument, new
        refers to the parameterized constructor in MyClass,
        not the default constructor.
        Создать ссылку на конструктор MyClass.
        Т.к. метод func() интерфейса MyFunc принимает аргумент,
        new ссылается на параметризованный конструктор MyClass,
        а не на конструктор по умолчанию.         */
        MyFunc2 myClassCons = MyClass5::new;  //A constructor reference

        //Create an instance of MyClass5 via that constructor reference.
        // Создать экземпляр MyClass посредством ссылки на конструктор
        MyClass5 mc = myClassCons.func("Testing");

        //Use the instance of MyClass5 just created.
        // Использовать только что созданный экземпляр MyClass
        System.out.println("str in mc is " + mc.getStr());
    }
}
