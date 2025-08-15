package practise_java_questions.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] array = {0, 2, 0, 4, 6, 0, 8, 10, 0};

        System.out.println("Original Array: ");
        printArray(array);

        moveZerosToEnd(array);

        System.out.println("\nArray after moving zeros to the end: ");
        printArray(array);
    }

    private static void moveZerosToEnd(int[] array) {
        int nonZeroIndex = 0;

        // Traverse the array and move non-zero elements to the beginning:
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[nonZeroIndex] = array[i];
                nonZeroIndex++;
            }
        }

        // Fill the remaining positions with zeros:
        while (nonZeroIndex < array.length) {
            array[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
