package practise_java_questions.string;

public class _RemoveJunkSpecialChars {
    public static void main(String[] args) {
        String s ="汉字/漢字 Pizdec Nahui blyat'";
        s = s.replaceAll("[^a-zA-Z0-9]", " ").trim();
        System.out.println(s);
    }
}
