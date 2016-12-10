package bookpack;

/**
 * Created by Оксана on 10.12.2016.
 */
//1) Book recoded for public access.
public class Book1 {
    //1) Book and its members must be public in order to be used by packages.
//    private String title;
//    private String author;
//    private int pubDate;

    //2)these are now protected
    protected String title;
    protected String author;
    protected int pubDate;

    //1) Now public
    public Book1 (String t,String a, int d){
        title=t;
        author=a;
        pubDate=d;
    }

    //1) Now public
    public void show(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}
