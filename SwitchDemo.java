/**
 * Created by RUSLAN77 on 14.06.2016.
 */
public class SwitchDemo {
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 10; i++)
            switch (i) {
                case 0:
                    System.out.println("i equal 0");
                    break;
                case 1:
                    System.out.println("i equal 1");
                    break;
                case 2:
                    System.out.println("i equal 2");
                    break;
                case 3:
                    System.out.println("i equal 3");
                    break;
                case 4:
                    System.out.println("i equal 4");
                    break;
                default:
                    System.out.println("i equal ore more than 5");
            }
    }
}

