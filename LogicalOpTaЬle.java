/**
 * Created by RUSLAN77 on 16.05.2016.
 */
public class LogicalOpTaЬle {
    public static void main(String[] args) {
        boolean p, q;
//        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");

//        p = q = true;
//        System.out.print(p + "\t" + q + "\t");
//        System.out.print((p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p) +"\n");
//
//        p = true;
//        q = false;
//        System.out.print(p + "\t" + q + "\t");
//        System.out.print((p & q) + "\t" + (p | q) + "\t");
//        System.out.println((p ^ q) + "\t" + (!p));
//
//        p = false;
//        q = true;
//        System.out.print(p + "\t" + q + "\t");
//        System.out.print((p & q) + "\t" + (p | q) + "\t");
//        System.out.println((p ^ q) + "\t" + (!p));
//
//        p = q = false;
//        System.out.print(p + "\t" + q + "\t");
//        System.out.print((p & q) + "\t" + (p | q) + "\t");
//        System.out.println((p ^ q) + "\t" + (!p));

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = q = true;
        System.out.print(((p == true) ? 1 : 0) + "\t" + ((q == true) ? 1 : 0) + "\t");
        System.out.print((((p & q) == true) ? 1 : 0) + "\t" + (((p | q) == true) ? 1 : 0) + "\t");
        System.out.println((((p ^ q) == true) ? 1 : 0) + "\t" + (((!p) == true) ? 1 : 0));

        p = true;
        q = false;
        System.out.print(((p == true) ? 1 : 0) + "\t" + ((q == true) ? 1 : 0) + "\t");
        System.out.print((((p & q) == true) ? 1 : 0) + "\t" + (((p | q) == true) ? 1 : 0) + "\t");
        System.out.println((((p ^ q) == true) ? 1 : 0) + "\t" + (((!p) == true) ? 1 : 0));

        p = false;
        q = true;
        System.out.print(((p == true) ? 1 : 0) + "\t" + ((q == true) ? 1 : 0) + "\t");
        System.out.print((((p & q) == true) ? 1 : 0) + "\t" + (((p | q) == true) ? 1 : 0) + "\t");
        System.out.println((((p ^ q) == true) ? 1 : 0) + "\t" + (((!p) == true) ? 1 : 0));

        p = q = false;
        System.out.print(((p == true) ? 1 : 0) + "\t" + ((q == true) ? 1 : 0) + "\t");
        System.out.print((((p & q) == true) ? 1 : 0) + "\t" + (((p | q) == true) ? 1 : 0) + "\t");
        System.out.println((((p ^ q) == true) ? 1 : 0) + "\t" + (((!p) == true) ? 1 : 0));

    }
}
