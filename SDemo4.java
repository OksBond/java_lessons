/**
 * Created by Оксана on 26.11.2016.
 */

//A stack class for characters.
//Класс, реализующий стек для хранения символов
class Stack {
    private char stck[];    //this array hold the stack
    private int tos;    //top of stack

    //Construct an empty Stack given its size.
    //Создать пустой стек заданного размера
    Stack(int size) {
        stck = new char[size];    //allocate memory for stack
        tos = 0;
    }

    //Construct a Stack from a Stack.
    //Создать один стек из другого стека
    Stack(Stack ob) {
        tos = ob.tos;
        stck = new char[ob.stck.length];

        //copy elements
        for (int i = 0; i < tos; i++)
            stck[i] = ob.stck[i];
    }

    //Construct a stack with initial values.
    //Создать стек с начальными значениями
    Stack(char a[]) {
        stck = new char[a.length];

        for (int i = 0; i < a.length; i++) {
            push(a[i]);
        }
    }

    //Push (Поместить) characters onto the Stack.
    void push(char ch) {
        if (tos == stck.length) {
            System.out.println("--Stack is full.");
            return;
        }

        stck[tos] = ch;
        tos++;
    }

    //Pop (Извлечь) z character from the stack/
    char pop() {
        if (tos == 0) {
            System.out.println("--Stack is empty.");
            return (char) 0;
        }

        tos--;
        return stck[tos];
    }
}

//Demonstrate the Stack class.
public class SDemo4 {
    public static void main(String[] args) {
        //construct 10-element empty stack.
        Stack stk1 = new Stack(10);

        char name[] = {'T', 'o', 'm'};

        //construct stack from array
        Stack stk2 = new Stack(name);

        char ch;
        int i;

        //put some characters into stk1
        for (i = 0; i < 10; i++)
            stk1.push((char) ('A' + i));

        //construct stack from another stack.
        Stack stk3 = new Stack(stk1);

        //show the stacks.
        System.out.print("Contents of stk1: ");
        for (i = 0; i < 10; i++) {
            ch = stk1.pop();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of stk2: ");
        for (i = 0; i < 3; i++) {
            ch = stk2.pop();
            System.out.print(ch);
        }

        System.out.println("\n");
        System.out.println("Contents of stk3: ");
        for (i = 0; i < 10; i++) {
            ch = stk3.pop();
            System.out.print(ch);
        }
    }
}
