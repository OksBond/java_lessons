/**
 * Created by Оксана on 16.01.2017.
 */
/* Демонстрация ввода-вывода с произвольным доступом:
 шесть значений типа double сначала записываются в файл,а затем
 читаются из него, причем порядок их чтения отличается от порядка записи.
 */
//Demonstrate random access files.

    import java.io.*;
public class RandomAccessDemo {
    public static void main(String[] args) {
        double data[]={19.4,10.1,123.54,33.0,87.9,74.25};
        double d;

        //Open and use a random access file.
        try (RandomAccessFile raf=new RandomAccessFile("random.dat", "rw")){//Open random-access file
            //Write values to the file.
            for (int i = 0; i <data.length ; i++) {
                raf.writeDouble(data[i]);
            }

            //Now, read back specific values - Прочитать отдельные значения из файла
            raf.seek(0); //seek to first double-найти первое значение типа double;
            //Use seek() to set the file pointer-Установка указателя файла с пом. метода seek()
            d=raf.readDouble();
            System.out.println("First value is " + d);

            raf.seek(8); //seek to second double
            d=raf.readDouble();
            System.out.println("Seconf value is " + d);

            raf.seek(8*3); //seek to fourth double
            d=raf.readDouble();
            System.out.println("Fourth value is " + d);

            System.out.println();

            //Now, read every other value - Прочитать значения через одно
            System.out.println("Here is every other value: ");
            //"Чтeниe значений с нечетными порядковыми номерами: "
            for (int i = 0; i <data.length ; i+=2) {
                raf.seek(8*i); //seek to ith double - найти i-e значение типа double
                d=raf.readDouble();
                System.out.print(d + " ");
            }
        }
        catch (IOException exc){
            System.out.println("I/O Error: " + exc);
        }
    }
}

/*Отдельное замечание следует сделать относительно позиций расположения значений
в файле. Поскольку для хранения значения типа douЫe требуется 8 байтов, каждое последующее
значение начинается на 8-байтовой границе предьшущего значения. Иными
словами, первое числовое значение начинается с нулевого байта, второе - с 8-ro байта,
третье - с 16-ro байта и т.д. Поэтому для чтения четвертого значения указатель файла
должен быть установлен при вызове метода seek () на позиции 24-ro байта.
 */