/**
 * Created by Оксана on 01.03.2017.
 */

//A generic stack.
//Обобщенный стек
public interface IGenStack <T> {
    void push (T obj) throws StackFullException;
    T pop ()throws StackEmptyException;
}
