/**
 * Created by RUSLAN77 on 26.07.2016.
 */

//Apply continue statement with label
public class ContToLabel {
    public static void main(String[] args) {

        outerloop:
        for (int i=1; i<10; i++){
            System.out.print("\n The outer cycle : passage " +i+ " The inner cycle");
            for (int j=1; j<10; j++){
                if (j==5) continue outerloop;// continue the outer cycle
                System.out.print(" "+j);
            }
        }
    }
}
