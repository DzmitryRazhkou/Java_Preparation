package practise_java_questions.string;

public class CapitalizeWords {
    public static void main(String[] args) {
        capitalize("gans automation labs");
    }

    public static void capitalize(String str) {
        String[] words = str.split("\\s");
        String result = "";

        for (String w : words) {
            String first = w.substring(0, 1).toUpperCase();   //G
            String rest = w.substring(1); //ans
            result = result + first + rest + " ";
        }

        System.out.println(result);
    }
}

