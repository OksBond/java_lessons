/**
 * Created by Оксана on 11.12.2016.
 */

/*(2) An enhanced (усовершенствованный) version of Series that
includes a default method called getNextArray()    */
public interface Series {
    int getNext();  //return next number in series (в ряду)
    // возратить следующее по порядку число

    /*(2)Return an array that contains the next n elements
     in the series beyond the current element.     */
    default int[] getNextArray(int n) {
        int[] vals = new int[n];

        for (int i = 0; i < n; i++)vals[i] = getNext();
        return vals;
    }

    void reset();   //restart - сброс
    void setStart(int x); //set starting value - установить нач. зн-е
}

/*Реал-е методы И. д.б. объявлены открытыми (puЫic). Пример класса
 ByTwos, реал-го И. Series. В классе формируется последовательный
 ряд числ. зн-й, каждое из кот. на 2 больше предыдущего.*/

/*В классе, реал-щем интерфейс(И), м.б. доп. переменные и методы
 - допустимо. В версию класса ByТwos добавлен метод getPrevious (),
  возвращающий предыдущее числовое значение.*/
//1) Implement Series. - Реализация интерфейса Series
//2) Add getPrevious().
class ByTwos implements Series { //Implements the Series interface
    int start;
    int val;
    int prev;

    ByTwos() {
        start = 0;
        val = 0;
        prev = -2;
    }

    public int getNext() {
        prev = val;
        val += 2;
        return val;
    }

    public void reset() {
        //val=start;
        start = 0;
        val = 0;
        prev = -2;
    }

    public void setStart(int x) {
        start = x;
        val = x;
        prev = x - 2;

    }

    int getPrevious() {  //Add a method not defined by Series.
        return prev;
    }
}
/*!!!Для добавления метода getPrevious () изменили реализацию методов,
объявленных в И. Series. Но сам И. не изменился. Эти изм-я не видны
вне класса и не влияют на его использование. В этом и состоит одно
из преимуществ И.  */

/*И. м.б. реализован любым кол-вом классов.  Класс ByThrees
формирует последовательный ряд числ. зн-й, каждое из кот.
на 3 больше предыдущего.*/
//Implement Series. Еще одна реализация интерфейса Series
class ByThrees implements Series { //Implement Series a different way.
    int start;
    int val;

    ByThrees() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 3;
        return val;
    }

    public void reset() {
        val = start;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}

class SeriesDemo {
    public static void main(String[] args) {
        ByTwos ob = new ByTwos();

        for (int i = 0; i < 5; i++)
            System.out.println("Next value is " +
                    ob.getNext());

        System.out.println("\nResetting");
        ob.reset();
        for (int i = 0; i < 5; i++)
            System.out.println("Next value is " +
                    ob.getNext());

        System.out.println("\nStarting at 100");
        ob.setStart(100);
        for (int i = 0; i < 5; i++)
            System.out.println("Next value is " +
                    ob.getNext());
    }
}

