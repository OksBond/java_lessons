/**
 * Created by Оксана on 14.12.2016.
 */
public interface MyIF {//This is a "normal" interface method declaration.
    //It does NOT define a default implementation.
    int getUserID();

    //this is a default method. Notice that it provides
    //a default implementation.
    default int getAdminID(){
        return 1;
    }
}
