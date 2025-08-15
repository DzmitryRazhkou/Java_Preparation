package practise_java_questions.String;

public class _StringSplitOperation {
    public static void main(String[] args) {
        String str = "Hello,world,how,are,you";

        // Splitting the string using comma as delimiter
        String[] parts = splitString(str, ',');

        // Printing the split parts
        for (String part : parts) {
            System.out.println(part);
        }
    }

    public static String[] splitString(String str, char delimiter) {
        // Counting the occurrences of the delimiter to determine the size of the array
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == delimiter) {
                count++;
            }
        }

        // Creating the array to hold the split parts
        String[] parts = new String[count + 1];

        // Splitting the string
        int startIndex = 0;
        int partIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == delimiter) {
                parts[partIndex] = str.substring(startIndex, i);
                startIndex = i + 1;
                partIndex++;
            }
        }
        // Adding the last part
        parts[partIndex] = str.substring(startIndex);

        return parts;
    }
}
