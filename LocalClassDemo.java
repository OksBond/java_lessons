/**
 * Created by Оксана on 21.11.2016.
 */
//Use ShowBits  as local class

public class LocalClassDemo {
    public static void main(String[] args) {

        //An inner class version of ShowBits
        class ShowBits {    //A local class nested within a method
            int numbits;

            ShowBits (int n){
                numbits=n;
            }

            void show(long val){
                long mask=1;

                //left-shift a 1 into the proper position
                mask<<=numbits-1;

                int spacer=0;
                for (; mask!=0; mask>>>=1){
                    if ((val&mask)!=0) System.out.print("1");
                    else System.out.println();
                }
            }

        }
    }
}
