/**
 * Created by Оксана on 15.02.2017.
 */

//Demonstrate a simple generic method.
public class GenericMethodDemo {

    //Determine if the contents of two arrays are the same.
    //Определить, совпадает ли содержимое двух массивов
    static <T extends Comparable<T>, V extends T> boolean
    arraysEqual(T[] x, V[] y) { //a generic method.
        //If array lengths differ, then the arrays differ.
        //Массивы, имеющие разную длину, не м.б. одинаковыми
        if (x.length!=y.length) return false;

        for (int i = 0; i <x.length ; i++)
            if (!x[i].equals(y[i])) return false;   //arrays differ

            return true;    //contents of arrays are equivalent
    }

    public static void main(String[] args) {

        Integer nums[]={1,2,3,4,5};
        Integer nums2[]={1,2,3,4,5};
        Integer nums3[]={1,2,7,4,5};
        Integer nums4[]={1,2,7,4,5,6};

        if (arraysEqual(nums, nums))
            //The type of argumints for T and V are implicitly
        //determined when the method is called.
            System.out.println("nums equals nums");

        if (arraysEqual(nums, nums2))
            System.out.println("nums equals nums2");

        if (arraysEqual(nums, nums3))
            System.out.println("nums equals nums3");

        if (arraysEqual(nums, nums4))
            System.out.println("nums equals nums4");

        //Create an array of Doubles
        Double dvals[]={1.1,2.2,3.3,4.4,5.5};


        //This won't compile because nums and dvals
        //are not of the same type.
//        if (arraysEqual(nums, dvals))
//            System.out.println("nums equals dvals");

        Double dv2[]={1.1,2.2,3.3,4.4,5.5};

        if (arraysEqual(dvals, dv2))
            System.out.println("dvals equals dv2");
    }
}
