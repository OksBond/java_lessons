/**
 * Created by Оксана on 14.02.2017.
 */

//Demonstrate a wildcard (шаблон аргумента)
public class WildcardDemo {
    public static void main(String[] args) {

        NumericFns<Integer> iOb=
                new NumericFns<Integer>(6);

        NumericFns<Double> dOb=
                new NumericFns<Double>(-6.0);

        NumericFns<Long> lOb=new NumericFns<Long>(5L);

        System.out.println("Testing iOb and dOb.");
        if (iOb.absEqual(dOb))  //In this call, the wildcard type matches(совпадает) Double
            System.out.println("Absolute values are equal.");
        else
            System.out.println("Absolute values are differ.");

        System.out.println();

        System.out.println("Testing iOb and lOb.");
        if (iOb.absEqual(lOb))  //In this call, the wildcard type matches(совпадает) Long
            System.out.println("Absolute values are equal.");
        else
            System.out.println("Absolute values are differ.");
    }
}
