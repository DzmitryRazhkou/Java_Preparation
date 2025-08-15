package practise_java_questions.Arrays;

public class MoveZerosToStart {
    public static void main(String[] args) {
        int[] array = {0, 3, 0, 8, 12, 0, 5, 0, 7};

        System.out.println("Original Array: ");
        printArray(array);

        moveZerosToStart(array);

        System.out.println("\nArray after moving zeros to the start: ");
        printArray(array);
    }

    private static void moveZerosToStart(int[] array) {
        int nonZeroIndex = array.length - 1;

        // Iterate from the end of the array
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != 0) {
                // Swap non-zero element with the last non-zero index
                int temp = array[i];
                array[i] = array[nonZeroIndex];
                array[nonZeroIndex] = temp;

                // Update the last non-zero index
                nonZeroIndex--;
            }
        }
    }

    // Function to print an array
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
