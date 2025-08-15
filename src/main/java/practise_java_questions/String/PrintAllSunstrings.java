package practise_java_questions.String;

public class PrintAllSunstrings {
    public static void main(String[] args) {
        String inputString = "appiuM XCUITest Cypress";
        printAllSubstrings(inputString);
    }

    private static void printAllSubstrings(String input) {
        for (int start = 0; start < input.length(); start++) {
            for (int end = start + 1; end <= input.length(); end++) {
                System.out.println(input.substring(start, end));
            }
        }
    }
}
