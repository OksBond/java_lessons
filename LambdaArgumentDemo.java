/**
 * Created by Оксана on 05.04.2017.
 */

//Use a lambda expression as an argument to a method.
interface StringFunc{
    String func(String str);
}

public class LambdaArgumentDemo {
    /*This method has a functional interface as the type of its first parameter.
    Thus, it can be passed a reference to any instance of that interface,
    including an instance created by a lambda expression. The second parameter
    specifies the string to operate on.
    В дан. методе типом первого пар-ра явл. функц. и-фейс. Т.е., ему можно передать
    ссылку на любой экз-р этого и-фейса, в т.ч. и на экз-р, созданный
    посредством Л-В. С пом. 2-го пар-ра задается строка, подлежащая обработке.
     */
    static String changeStr(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr="Lambda Expressions Expand Java";
        String outStr;

        System.out.println("Here is input string: " + inStr);

        /*Define a lambda expression that reverses the content of a string
        and assing it to a StringFunc reference variable.
        Определите лямбда-выражение, располагающее содержимое
        строки в обратном порядке, и присвойте его переменной,
        ссылающейся на экземпляр StringFunc.
         */
        StringFunc reverse = (str) ->{
            String result ="";
            for (int i =str.length()-1; i >=0 ; i--)
                result+=str.charAt(i);

            return result;
        };

        /*Pass reverse to the first argument to changeStr().
        Pass the input string as the second argumtnt.
        Передайте reverse методу changeStr() в качестве первого аргумента.
        Передайте входную строку в качестве второго аргумента.
         */
        outStr=changeStr(reverse,inStr);
        System.out.println("The string reversed: " + outStr); //"Oбpaщeннaя строка: "

        /*This lambda expression replaces spaces with hyphens.
        It is embedded directly in the call to changeStr().
        Данное лямбда-выражение заменяет пробелы дефисами.
        Оно внедряется непосредственно в вызов метода changeStr().
         */
        outStr=changeStr((str)->str.replace(' ','-'), inStr);
        System.out.println("The string with spaces replaced: " + outStr);

        /*This block lambda inverts the case of the characters in the
        string. It is also embedded directly in the call to changeStr().
        Данное блочное лямбда-выражение обращает регистр букв в строке.
        Оно также внедряется непосредственно в вызов метода changeStr().
         */
        outStr=changeStr((str)->{
            String result="";
            char ch;

            for (int i = 0; i <str.length() ; i++) {
                ch=str.charAt(i);
                if (Character.isUpperCase(ch))
                    result+=Character.toLowerCase(ch);
                else
                    result+=Character.toUpperCase(ch);
            }
            return result;
        },inStr);

        System.out.println("The string in reversed case: " + outStr);
    }
}


