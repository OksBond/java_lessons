/**
 * Created by Оксана on 13.02.2017.
 */

/*In this version of NumbericFns, the type argument for T must be
either Number, or a class derived from Number.
В этой версии класса NumericFns аргументом типа, заменяющим параметр
типа Т, должен стать класс Number или производный от него подкласс.
*/
//(2)Use a wildcard (шаблон аргумента)
class NumericFns<T extends Number>{ //In this case, the type argument
    //must be either Number, or a subclass of Number.
    T num;

    //Pass the constructor a reference to a numeric object.
    NumericFns (T n){
        num=n;
    }

    //Return the reciprocal.
    double reciprocal(){
        return 1/num.doubleValue();
    }

    //Return the fractional component.
    double fraction(){
        return num.doubleValue()-num.intValue();
    }

    //(2)Determine (определить) if the absolute values of two objects are the same.
    //Проверить равенство абсолютных значений двух объектов
    boolean absEqual(NumericFns<?> ob){
        if(Math.abs(num.doubleValue())==
                Math.abs(ob.num.doubleValue())) return true;

        return false;
    }
}

//Demonstrate NumericFns.
public class BoundsDemo {
    public static void main(String[] args) {
        NumericFns<Integer> iOb=    //Integer is OK because it is a subclass of Number.
                new NumericFns<Integer>(5);

        System.out.println("Reciprocal of iOb is " +
        iOb.reciprocal());
        System.out.println("Frectional component of iOb is " +
        iOb.fraction());

        System.out.println();

        NumericFns<Double> dOb=     //Double is also OK.
                new NumericFns<Double>(5.25);

        System.out.println("Reciprocal of dOb is " +
                iOb.reciprocal());
        System.out.println("Frectional component of dOb is " +
                iOb.fraction());

        //This won't comple because String is not a subclass of Number.
//        NumericFns<String> strOb=     //String is illegal because it is not a subclass of Number.
//                new NumericFns<String>("Error");

    }
}
