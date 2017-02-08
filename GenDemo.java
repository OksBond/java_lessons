/**
 * Created by Оксана on 08.02.2017.
 */

/*A simple generic class. Here, T is a type parameter that will be
replaced by a real type when an object of type Gen is created.
Простой обобщенный класс. Здесь Т - это параметр типа, вместо которого
при создании объекта класса Gen будет подставляться реально существующий тип.
*/

//Declare a generic class. T is the generic type parameter.
//В объявлении этого класса Т означает обобщенный тип.
class Gen<T> {
    T ob;   //Объявить объект типа T

    //Pass the constructor a reference to an object of type T.
    //Передать конструктору ссылку на объект типа Т.
    Gen(T o) {
        ob = o;
    }

    //Return ob - Вернуть объект оЬ из метода.
    T getOb() {
        return ob;
    }

    //Show type of T - Отобразить тип Т.
    void showType() {
        System.out.println("Type of T is " +
                ob.getClass().getName());
    }
}

//Demonstrate the generic class.
public class GenDemo {
    public static void main(String[] args) {
        //Create a Gen reference for Integers - Создать ссылку на объект типа Gen<Integer>
        Gen<Integer> iOb;

        /*Create a Gen<Integer> object and assign(присвоить) its(его) reference to iOb.
        Notice the use of autoboxing to encapsulate the value 88 within an Integer object.
        Обр. внимание на автоупаковку при инкапсуляции значения 88 в объекте типа Integer.
         */
        iOb=new Gen<Integer>(88);   //Instantiate an object of type Gen<Integer>
                                    //Создание экземпляра типа Gen<Integer>

        //Show the type of data used by iOb.
        iOb.showType();

        //Get the value in iOb. Notice that no cast is needed.
        //Получить значения из объекта iOb. !!! приведение типов здесь не треб-ся.
        int v=iOb.getOb();
        System.out.println("value: " + v);

        System.out.println();

        //Create a Gen object for Strings. Create a reference and an object of type Gen<String>.
        Gen<String> strOb=new Gen<String>("Generics Test");

        //Show the type of data used by strOb.
        strOb.showType();

        ///Get the value of strOb. Again, notice that no cast(приведение типов) is needed.
        String str=strOb.getOb();
        System.out.println("value: "+ str);
    }
}
