package practise_java_questions.String;

public class CapitalizeWords {
    public static void main(String[] args) {
        capitalize("gans automation labs");
        capitalizeStringBuilder("gans automation labs");
    }

    public static void capitalize(String str) {
        String[] words = str.split("\\s");
        String result = "";

        for (String w : words) {
            String rest = w.substring(0, 1).toUpperCase() + w.substring(1);
            result += rest + " ";
        }
        System.out.println(result);
    }

    public static void capitalizeStringBuilder(String str) {
        StringBuilder result = new StringBuilder();
        String[] words = str.split("\\s");

        for (String w : words) {
            StringBuilder rest = new StringBuilder();
            rest.append(w.toString().substring(0, 1).toUpperCase() + w.substring(1));
            result.append(rest).append(" ");
        }
        System.out.println(result);
    }

}

