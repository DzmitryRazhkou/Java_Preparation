package practise_java_questions.String;

public class CountOccurrenceOfParticularCharacterInString {
    public static void main(String[] args) {
        String inputString = "Appium XCUITest Cypress";
        String modified = inputString.toLowerCase().replaceAll(" ", "");

        int countOccurrencesCharAt = countOccurrencesCharAt(modified, 'p');
        System.out.println("The Occurrence Using 'CharAt()' Is: " + countOccurrencesCharAt);

        int countOccurrencesToCharArray = countOccurrencesToCharArray(modified, 'p');
        System.out.println("The Occurrence Using 'toCharArray()' Is: " + countOccurrencesToCharArray);
    }

    private static int countOccurrencesCharAt(String input, char target) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    private static int countOccurrencesToCharArray(String input, char target) {
        int count = 0;
        for (char s : input.toCharArray()) {
            if (s == target) {
                count++;
            }
        }
        return count;
    }
}
