/**
 * Created by Оксана on 06.12.2016.
 */

// Method overriding.
    class A2 {
    int i,j;
    A2(int a, int b){
        i=a;
        j=b;
    }

    //display i and j
    void show (){
        System.out.println("i and j: " + i + " " +j);
    }
}

class B2 extends A2 {
    int k;
    B2 (int a, int b, int c){
        super(a,b);

        k=c;
    }

    //display k - this overrides show() in A2
    void show (){   //This show() in B2 overrides the one defined by A2.
        //super.show();
        //Use super to call the version of show() defined by superclass A2.
        System.out.println("k: "+ k);
    }
}

public class Override {
    public static void main(String[] args) {
        B2 subOb=new B2(1,2,3);

        subOb.show();   //this calles show() in B2.
    }
}
