package practise_java_questions.String;

public class CountOccurrenceOfVowelsInString {
    public static void main(String[] args) {
        String inputString = "Appium XCUITest Cypress";
        String modified = inputString.toLowerCase().replaceAll(" ", "");

        int countOccurrencesVowelsWayFirst = countOccurrencesVowelsWayFirst(modified);
        System.out.println("The Occurrence Of THe Vowels Using 'CharAt()' is: " + countOccurrencesVowelsWayFirst);

        int countOccurrencesVowelsWaySecond = countOccurrencesVowelsWaySecond(modified);
        System.out.println("The Occurrence Of THe Vowels Using 'contains(String.valueOf(s))' is: " + countOccurrencesVowelsWaySecond);
    }

    private static int countOccurrencesVowelsWayFirst(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char option = input.charAt(i);
            if (option == 'a' || option == 'e' || option == 'i' || option == 'o' || option == 'u') {
                count++;
            }
        }
        return count;
    }

    private static int countOccurrencesVowelsWaySecond(String input) {
        int count = 0;
        String vowels = "aeiou";
        for (char s : input.toCharArray()) {
            if (vowels.contains(String.valueOf(s))) {
                count++;
            }
        }
        return count;
    }

}
