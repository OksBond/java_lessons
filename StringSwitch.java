/**
 * Created by Оксана on 18.10.2016.
 */
/*Use a string to control a switch statement -
Использование строк для управления оператором switch
*/
public class StringSwitch {
    public static void main(String[] args) {
        String command="cancel";

        switch (command){
            case "connect":
                System.out.println("Connecting/Подключение");
                break;
            case "cancel":
                System.out.println("Canceling/Отмена");
                break;
            case "disconnect":
                System.out.println("Disconnecting/Отключение");
                break;
            default:
                System.out.println("Command error!/Неверная команда!");
                break;
        }
    }
}
