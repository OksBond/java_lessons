/**
 * Created by RUSLAN77 on 26.07.2016.
 */

//operator use continue
public class ContDemo {
    public static void main(String[] args) {
        int i;

        //display even numbers from 0 to 100
for (i=0; i<100; i++){
    if ((i%2)!=0) continue; //complete cycle iteration step
    System.out.println(i);
}
    }
}
