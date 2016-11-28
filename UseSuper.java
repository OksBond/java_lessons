/**
 * Created by Оксана on 28.11.2016.
 */

//Using super to overcome (предотвратить?) name hiding
// Исп-е кл. слова super для предотвращения сокрытия имен.
class A {
    int i;
}

//Create a subclass by extending (расширяющий?) class A.
class B extends A {
    int i;  //this 'i' hides (скрывает) the 'i' in A.

    B(int a, int b) {
        super.i = a; //'i' in A - here, super.i refers to the 'i' in A.
        i = b; //'i' in B
    }

    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}

public class UseSuper {
    public static void main(String[] args) {
        B subOb = new B(1, 2);

        subOb.show();
    }
}
