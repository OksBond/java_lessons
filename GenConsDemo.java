/**
 * Created by Оксана on 15.02.2017.
 */

//Use a generic constructor.
    class Summation2{
    private int sum;

    <T extends Number> Summation2 (T arg){   //A generic constructor.
        sum=0;

        for (int i = 0; i <arg.intValue() ; i++)
            sum+=i;
        }

        int getSum(){
        return sum;
    }
}

public class GenConsDemo {
    public static void main(String[] args) {
        Summation2 ob=new Summation2(4.0);

        System.out.println("Summation of 4.0 is " + //"Cyммa целых чисел от О до 4.0 равна "
        ob.getSum());
    }
}
