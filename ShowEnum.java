/**
 * Created by Оксана on 07.02.2017.
 */

enum Tools {SCREWDRIVER, WRENCH, HAMMER,PLIERS}

public class ShowEnum {
    public static void main(String[] args) {
        for (Tools d:Tools.values())
            System.out.println(d + " has ordinal value of " +
            d.ordinal() + '\n');
    }
}
