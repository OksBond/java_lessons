/**
 * Created by RUSLAN77 on 16.07.2016.
 */
// The output of the square roots of numbers from 1 to 99
// with rounding error
class SqrRoot {
       public static void main(String args[]) {
       double num, sroot, rerr;
        for (num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("The square root of  " + num +
                            " equal " + sroot);
// вычислить ошибку округления
            rerr = num - (sroot * sroot);
            System.out.println("Error in rounding off: "+ rerr);
            System.out.println();
        }
    }
}
