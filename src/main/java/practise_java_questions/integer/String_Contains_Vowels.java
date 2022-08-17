package practise_java_questions.integer;

import java.util.Scanner;

public class String_Contains_Vowels {
    public static void main(String[] args) {
//        Scanner rd = new Scanner(System.in);
//        System.out.println("Plz enter string: ");
//        String str = rd.next();
//
//        if (str.toLowerCase().matches(".*[aeiou].*")) {
//            System.out.println(str + " - Contains");
//        } else {
//            System.out.println(str + " No");
//        }

        System.out.println(StringContainsVowels("Ukraine"));
    }



    public static boolean StringContainsVowels(String str) {
        return str.toLowerCase().matches(".*[aeiou].*");
    }
}
