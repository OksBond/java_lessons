/**
 * Created by Оксана on 21.11.2016.
 */
//Use an inner class
class Outer {
    int nums[];

    Outer(int n[]) {
        nums = n;
    }

    void analyze() {
        Inner inOb = new Inner();

        System.out.println("Min: " + inOb.min());
        System.out.println("Max: " + inOb.max());
        System.out.println("Average: " + inOb.avr());
    }

    //An inner class
    class Inner {
        int min() {
            int m = nums[0];
            for (int i = 1; i < nums.length; i++)
                if (nums[i] < m) m = nums[i];

            return m;
        }

        int max() {
            int m = nums[0];
            for (int i = 1; i < nums.length; i++)
                if (nums[i] > m) m = nums[i];

            return m;
        }

        int avr(){
            int a=0;
            for (int i = 0; i < nums.length; i++)
                a+=nums[i];

            return a/nums.length;
        }
    }
}

public class NestedClassDemo {
    public static void main(String[] args) {
int x[]={3,2,1,5,6,9,7,8};

        Outer outOb=new Outer(x);;

        outOb.analyze();
    }
}
