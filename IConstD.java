/**
 * Created by Оксана on 14.12.2016.
 */
//An interface that contains constants.
    interface IConst{
    //These are constants.
    int MIN=0;
    int MAX=10;
    String ERRORMSG="Boundary Error";
}

public class IConstD implements IConst{
    public static void main(String[] args) {
        int nums[]=new int[MAX];

        for (int i =MIN; i <11 ; i++) {
            if (i>=MAX) System.out.println(ERRORMSG);
            else {
                nums[i]=i;
                System.out.print(nums[i]+ " ");
            }
        }
    }
}
