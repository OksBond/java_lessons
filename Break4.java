/**
 * Created by RUSLAN77 on 17.07.2016.
 */
// The use break with a label
class Break4 {
    public static void main(String args[]) {
        int i;
        for (i = 1; i < 4; i++) {
            one:{
                two: {
                    three: {
                        System.out.println("\n i equal " + i);
                        if (i == 1) break one;// Going by tag
                        if (i == 2) break two;
                        if (i == 3) break three;
                        // This line of code will never be achieved
                        System.out.println("It will not be displayed");
                    }
                    System.out.println("after block three");
                }
                System.out.println("after block two");
            }
            System.out.println("after block one");
        }
        System.out.println("after cycle for");
    }
}

