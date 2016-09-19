/**
 * Created by RUSLAN77 on 01.07.2016.
 */
public class Help {
    public static void main(String[] args) throws java.io.IOException {
        char choice;

        System.out.println("Help");
        System.out.println("1. If");
        System.out.println("2. switch");
        System.out.println("Choice:");

        choice=(char)System.in.read();

        switch (choice){
            case '1':
                System.out.println("Operator if:\n");
                System.out.println("if (condition) operator");
                System.out.println("else operator");
                break;
            case '2':
                System.out.println("Operator switch:\n");
                System.out.println("switch (condition) {");
                System.out.println("case constant");
                System.out.println("operator sequence");
                System.out.println("break");
                System.out.println("//...");
                System.out.println("}");
                break;
            default:
                System.out.println("The request is not found");

        }


    }
}
