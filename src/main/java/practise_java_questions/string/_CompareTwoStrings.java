package practise_java_questions.string;

public class _CompareTwoStrings {
    public static void main(String[] args) {
        String s1 = "Lev";
        String s2 = "Lev";
        boolean is = compareString(s1, s2);
        System.out.println(is);
    }

    public static boolean compareString(String s1, String s2) {
        if (s1 == null || s2 == null)
            return false;
        if (s1.length() != s2.length())
            return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }
}
