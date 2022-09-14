package practise_java_questions.string;


public class replaceAll {
    public static void main(String[] args) {

        String input = "Text  With     Whitespaces ";
        String result = input.replaceAll("\\s+", " "); // "\\s+" remove more tan one space
        System.out.println(result);

        String input_ = "Text  With     Whitespaces ";
        String result_ = input_.replaceAll("\\s", ""); // "\\s+" remove more tan one space
        System.out.println(result_);


    }
}
