package preparation.integer;

public class StringContainsVowels {
    public static void main(String[] args) {

        System.out.println(stringContainsVowels("Stairs"));
        System.out.println(stringContainsVowels("Pzzz"));

    }
    public static boolean stringContainsVowels(String str){
        return str.matches(".*[aeiou].*");
    }
}
