package practise_java_questions.tricky;

public class ConcatStringImmutable {
    public static void main(String[] args) {
        String x = "abc";
        String y = "abc";
        String t = x.concat(y);
        System.out.println(x);
    }
}
