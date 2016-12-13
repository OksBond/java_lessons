/**
 * Created by Оксана on 12.12.2016.
 */
public class SeriesDemo2 {
    public static void main(String[] args) {
        ByTwos twoOb=new ByTwos();
        ByThrees threeOb=new ByThrees();
        Series ob;

        for (int i = 0; i <5 ; i++) {
            ob=twoOb;
            System.out.println("Next ByTwos value is " +
                    ob.getNext());//Access an object via an interface reference.

            ob=threeOb;
            System.out.println("Next ByThrees value is " +
                    ob.getNext());//Access an object via an interface reference.
        }
    }
}
 /*В методе main () переменная оЬ объявляется как ссылка на И. Series.
 Т.е., в данной переменной может храниться ссылка на любой объект,
 реализующий И. Series - в д.сл. в переменной оЬ сохраняется ссылка
 на объекты twoOb кл. ByTwos и threeOb кл. ByThrees в разные моменты
 времени. Оба эти класса реализуют И. Series. Переменная ссылки на И.
 содержит сведения только о методах, объявленных в этом И. Т.е.,
 переменная оЬ не м.б. использована для доступа к любым др. переменным
 и методам, кот. поддерживаются в объекте, но не объявлены в И.*/