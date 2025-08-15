package practise_java_questions.String;

public class Extract4LastCharacterInString {
    public static void main(String[] args) {
        String inputString = "Appium XCUITest Cypress";
        String lastFourCharacters = extractLastFourCharacters(inputString);

        System.out.println("Last 4 Characters: " + lastFourCharacters);
    }

    private static String extractLastFourCharacters(String input) {
        if (input.length() < 4) {
            return "Input string is too short";
        } else {
            return input.substring(input.length() - 4);
        }
    }
}
