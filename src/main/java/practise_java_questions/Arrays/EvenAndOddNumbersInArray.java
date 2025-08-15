package practise_java_questions.Arrays;

public class EvenAndOddNumbersInArray {
    public static void main(String[] args) {
        int[] array = {95, 12, 56, 75, 9, 15, 175, 250};
        evenAndOddNumbersArray(array, array.length);
    }

    private static void evenAndOddNumbersArray(int[] array, int size) {
        // Separate even and odd elements:
        int[] evenArray = new int[size];
        int[] oddArray = new int[size];
        int evenCount = 0, oddCount = 0;

        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                evenArray[evenCount++] = array[i];
            } else {
                oddArray[oddCount++] = array[i];
            }
        }

        // Display even elements
        System.out.print("Even elements: ");
        for (int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i] + " ");
        }

        // Display odd elements
        System.out.print("\nOdd elements: ");
        for (int i = 0; i < oddArray.length; i++) {
            System.out.print(oddArray[i] + " ");
        }
    }
}
