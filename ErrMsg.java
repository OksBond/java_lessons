/**
 * Created by Оксана on 15.11.2016.
 */
//Return a String object.
    class ErrorMsg {
    String msgs[]={
            "Output Error", //Ошибка вывода
            "Input Error", //Ошибка ввода
            "Disk full", //Отсутствует место на диске
            "Index Out-Of-Bounds" //Выход индекса за границы диапазона
    };

    String getErrorMsg (int i){ //Return an object of type String
        if (i>=0 & i<msgs.length)
            return msgs[i];
        else
            return "Invalid Error Code";     //"Несуществующий код ошибки"
    }
}
public class ErrMsg {
    public static void main(String[] args) {
        ErrorMsg err=new ErrorMsg();

        System.out.println(err.getErrorMsg(2));
        System.out.println(err.getErrorMsg(19));
    }

}
