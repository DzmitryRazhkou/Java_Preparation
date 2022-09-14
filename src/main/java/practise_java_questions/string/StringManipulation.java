package practise_java_questions.string;

public class StringManipulation {
    public static void main(String[] args) {

        String str = "The rains have started here";
        String str1 = "The Rains have started here";

        System.out.println(str.length());

        System.out.println(str.indexOf('s'));   // 1st occurrence of "s"

        System.out.println(str.indexOf('s', str.indexOf('s') + 1));   // 2nd occurrence of 's'
//        System.out.println(str.indexOf('s', 9));

        System.out.println(str.indexOf("have"));

        System.out.println(str.indexOf("here"));

        System.out.println(str.indexOf("done"));   // if the word doesn't exist, it will return "-1".

        System.out.println(str.equals(str1));

        System.out.println(str.equalsIgnoreCase(str1));

//        Substring:

        System.out.println(str.substring(0, 9));

//        Trim:

        String s = "      Hello   Ukraine       ";
        System.out.println(s.trim());   // A trim method removes only before space and after space (between - not).
        System.out.println(s.replace("  ", ""));  // 1st - old char, 2nd - new one.

        String date = "05-28-1990";
        System.out.println(date.replace("-", "/"));

//        Split:
        String y = "This place was inhabited beings not like me";
        String res_y[] = y.split(" ");

        for (int i = 0; i < res_y.length; i++) {
            System.out.println(res_y[i]);
        }

        System.out.println("-------------");

        for (String t: res_y) {
            System.out.println(t);
        }

//        Concat:

        String s2 = "fire";
        System.out.println(s2.concat("s"));

        String z1 = "Hello";
        String z2 = "World";

        int a = 100;
        int b = 350;

        System.out.println(z1 + z2);
        System.out.println(z1 + z2 + a + b);
        System.out.println(z1 + z2 + (a + b));
        System.out.println((z1 + a) + (z2 + b));  // concatenation

    }
}
