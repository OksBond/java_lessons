/**
 * Created by Оксана on 10.12.2016.
 */

//This class is in package bookpackext.
package bookpackext;

//Use the Book class from bookpack.
public class UseBook {
    public static void main(String[] args) {
        //Qualify Book1 with its package name: bookpack.
        bookpack.Book1 books[]=new bookpack.Book1[5];

        books[0]=new bookpack.Book1("Java: A Beginner's Guide",
                "Schildt", 2014);
        books[1]=new bookpack.Book1("Java: The Complete Reference",
                "Schildt", 2014);
        books[2]=new bookpack.Book1("The Art if Java",
                "Schildt and Holmes", 2003);
        books[3]=new bookpack.Book1("Red Storm Rising",
                "Clancy", 1986);
        books[4]=new bookpack.Book1("On the Road",
                "Kerouac", 1955);

        for (int i = 0; i <books.length ; i++) books[i].show();
    }
}
