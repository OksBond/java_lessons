/**
 * Created by Оксана on 06.12.2016.
 */

/*Methods with differing signatures are
overloaded and not overridden. */
class A3{
    int i,j;

    A3(int a, int b){
        i=a;
        j=b;
    }

    //display i and j
    void show (){
        System.out.println("i and j: " + i + " " +j);
    }
}

//Create a subclass by extending class A3.
class B3 extends A3 {
    int k;

    B3 (int a, int b, int c){
        super(a,b);
        k=c;
    }

    //overload show()
    void show (String msg){   //Because signatures differ,
        // this show() simply overload show()in superclass A2.
        System.out.println(msg + k);
    }
}


public class Overload1 {
    public static void main(String[] args) {
        B3 subOb=new B3(1,2,3);

        subOb.show("This is k: ");  //this calls show() in B
        subOb.show(); //this calls show() in A
    }
}
