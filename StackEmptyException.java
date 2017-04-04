/**
 * Created by Оксана on 01.03.2017.
 */

//An exception for stack-empty errors.
//Исключение, возникающее при обращении к пустому стеку
public class StackEmptyException extends Exception {
    public String toString (){
        return "\nStack is empty.";
    }
}
