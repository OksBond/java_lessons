/**
 * Created by Оксана on 01.03.2017.
 */

//A stack class for characters.
//Класс, реализующий стек для хранения символов
public class GenStack<T> implements IGenStack<T> {
    private T stck[];   //this array hold the stack
    private int tos;    //top of stack

    //Construct an empty stack given its size.
    //Создать пустой стек заданного размера
    GenStack(T[] stckArray) {
        stck = stckArray;
        tos = 0;
    }

    //Construct a stack from a stack.
    //Создать один стек из другого стека
    GenStack(T[] stckArray, GenStack<T> ob) {
        tos = ob.tos;
        stck = stckArray;

        try {
            if (stck.length < ob.stck.length)
                throw new StackFullException(stck.length);
        } catch (StackFullException exc) {
            System.out.println(exc);
        }

        //Copy elements.
        for (int i = 0; i < tos; i++)
            stck[i] = ob.stck[i];
    }

    //Construct a stack with initial values.
    //Создать стек с начальными значениями
    GenStack(T[] stckArray, T[] a) {
        stck = stckArray;

        for (int i = 0; i < a.length; i++) {
            try {
                push(a[i]);
            } catch (StackFullException exc){
                System.out.println(exc);
            }
        }
    }

    //Push object onto the stack.
    //Поместить объекты в стек
    public void push (T obj) throws StackFullException {
        if (tos==stck.length)
            throw new StackFullException(stck.length);

        stck[tos]=obj;
        tos++;
    }

    //Pop an object from the stack.
    //Извлечь объекты из стека
    public T pop() throws StackEmptyException{
        if (tos==0)
            throw new StackEmptyException();

        tos--;
        return stck[tos];
    }
}
