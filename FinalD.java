/**
 * Created by Оксана on 08.12.2016.
 */

//Return a String object. - Возврат объекта типа String.
class ErrorMsg2{
    //Error codes. - Коды ошибок.
    //Константы объявляются с помощью ключевого слова final
    final int OUTERR=0;
    final int INNER=1;
    final int  DISKERR=2;
    final int INDEXERR=3;

String msgs[]={
        "Output Error", //Ошибка вывода
        "Input Error", //Ошибка ввода
        "Disk full", //Отсутствует место на диске
        "Index Out-Of-Bounds" //Выход индекса за границы диапазона
};

//Return the error message.
    String getErrorMsg(int i){
        if (i>=0 & i<msgs.length)
            return msgs[i];
        else
            return "Invalid Error Code";    //"Несуществующий код ошибки"
    }
}

class FinalD{
    public static void main(String[] args) {
        ErrorMsg2 err=new ErrorMsg2();

        /*Use final constants. - При вызове метода используются
        константы, объявленные с помощью кл. слова final
         */
        System.out.println(err.getErrorMsg(err.OUTERR));
        System.out.println(err.getErrorMsg(err.DISKERR));
    }
}