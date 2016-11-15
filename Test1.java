/**
 * Created by Оксана on 15.11.2016.
 */
//Objects are passed through their reference
public class Test1 {
    int a, b;

    Test1(int i, int j) {
        a = i;
        b = j;
    }

    /*Pass an object. Now ob.a and ob.b in
    object used in tne call will be changed.
     */
    void change(Test1 ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}

class PassObRef {
    public static void main(String[] args) {
        Test1 ob = new Test1(15, 20);

        System.out.println("ob.a and ob.b before call: " +
                ob.a + " " + ob.b);

        ob.change(ob);
        System.out.println("ob.a and ob.b after call: " +
                ob.a + " " + ob.b);
    }
}
