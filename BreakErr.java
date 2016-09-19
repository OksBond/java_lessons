/**
 * Created by RUSLAN77 on 26.07.2016.
 */

//in the break statement can not use a label, covering the uncertainty in its cycle!!!!!

public class BreakErr {
    public static void main(String[] args) {
        one:
        for (int i = 0; i < 3; i++) {
            System.out.println("Passage" + i + ":");
        }
        for (int j = 0; j < 100; j++) {
            //if (j == 10) break one;//The block of code labeled one's mark, does not contain a break statement
            // and therefore management can not be transferred to this unit.
            // (То есть блок кода не содержит метку и
            // программа работать не будет- и поєтому я закомитил проблемную строку

            System.out.println(j + "");
        }
    }
}

