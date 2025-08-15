package practise_java_questions.String;

public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        String inputString = "Chinese Radicals - 汉字偏旁部首!!!";
        String result = removeSpecialCharacters(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("String without special characters: " + result);
    }

    private static String removeSpecialCharacters(String input) {
        return input.replaceAll("[^a-zA-Z0-9]", "");
    }
}
