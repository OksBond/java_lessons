/**
 * Created by Оксана on 15.11.2016.
 */
//Return a programer-defined object.
    class Err{
    String msg; //error massage
    int severity;   //code indicating severity(серьезность, суроврсть) of error

    Err (String m, int s){
        msg=m;
        severity=s;
    }
}

class ErrorInfo {
    String msgs[]={
            "Output Error", //Ошибка вывода
            "Input Error", //Ошибка ввода
            "Disk full", //Отсутствует место на диске
            "Index Out-Of-Bounds" //Выход индекса за границы диапазона
    };
    int howbad[]={3,3,2,4};

    Err getErrorInfo (int i){   //Return an object of type Err.
        if (i>=0 & i<msgs.length)
            return new Err(msgs[i], howbad[i]);
        else
            return new Err("Invalid Error Code", 0);
    }
}

public class ErrInfo {
    public static void main(String[] args) {
        ErrorInfo err=new ErrorInfo();
        Err e;

        e=err.getErrorInfo(2);
       System.out.println(e.msg + " severity:" + e.severity);

        e=err.getErrorInfo(19);
        System.out.println(e.msg + " severity:" + e.severity);
    }
}
