/**
 * Created by RUSLAN77 on 14.06.2016.
 */
public class Ladder {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 6; x++) {
            if (x == 1)
                System.out.println("x equal 1");
            else if (x == 2)
                System.out.println("x equa 2");
            else if (x == 3)
                System.out.println("x equa 3");
            else if (x == 4)
                System.out.println("x equa 4");
            else
                //The condition is the default
                System.out.println("The value of x is outside the range of 1 - 4");
        }
    }
}
