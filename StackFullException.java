/**
 * Created by Оксана on 01.03.2017.
 */

//An exception for stack-full errorsl.
//Исключение, возникающее при переполнении стека
public class StackFullException extends Exception {
    int size;

    StackFullException (int s){size=s; }

    public String toString (){
        return "\nStack is full. Maximum size is " + size;
    }
}
