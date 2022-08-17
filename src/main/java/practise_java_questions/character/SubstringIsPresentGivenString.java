package practise_java_questions.character;

public class SubstringIsPresentGivenString {

    public static boolean isSubstring(String main, String sub) {

//        ^.*$ - match everything from start to end of the string

        return main.matches("(.*)" +sub+ "(.*)");
    }

    public static void main(String[] args) {
        System.out.println(isSubstring("naveenautomation", "auto"));
    }

}
