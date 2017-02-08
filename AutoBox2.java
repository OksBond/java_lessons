/**
 * Created by Оксана on 05.02.2017.
 */

//Autoboxing/unboxing takes place with method parameters and return values.
//Автоупаковка и автораспаковка при передаче
//параметров и возврате значений из методов
public class AutoBox2 {
    //This method has an Integer parameter.
    //Этот метод принимает параметр типа Integer
    static void m(Integer v){   //Receives an Integer.
        System.out.println("m() received " + v);
    }

    //This method returns an int.
    //Этот метод возвращает значение типа int
    static  int m2(){   //Returns an int.
        return 10;
    }

    //This method returns an Integer.
    static  Integer m3(){   //Returns an Integer.
        return 99;  //Autoboxing 99 into an Integer.
    }

    public static void main(String[] args) {
/*Pass an int to m(). Because m() has an Integer parameter, the int
value passed is automatically boxed.
Передача методу m() значения типа int. Метод m() принимает параметр
типа Integer, поэтому значение int автоматически упаковывается.
*/
m(199);

/*Here, iOv receives the int value reterned by m2(). This value
is automatically boxed so that it can be assigned to iOb.
Объект iOb получает значение типа int, возвращаемое методом m2().Это значение
авт-ки упаковывается, чтобы его можно было присвоить объекту iOb.
*/
Integer iOb=m2();

/*Next, m3() is called. It returns an Integer value which is auto-unboxing into an int.
Далее метод mЗ() возвращает значение типа Integer, которое
автоматически распаковывается и преобразуется в тип int.
 */
int i=m3();
        System.out.println("Return value from m3() is " + i);


// Далее методу Math.sqrt() в качестве параметра передается
// объект iOb, который автоматически распаковывается, а его
// значение повьппается до типа douЬle, требующегося для
// выполнения данного метода.


    }
}
