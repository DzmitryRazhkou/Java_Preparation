package practise_java_questions.Arrays;

public class CopyArrayToAnotherArray {
    public static void main(String[] args) {
        // Source array:
        int[] sourceArray = {75, 27, 5, 95, 175, 150, 9};

        // Destination array:
        int[] destinationArray = new int[sourceArray.length];

        // Copy elements from source array to destination array
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }

        // Display the original and copied arrays
        System.out.println("Source Array:");
        printArray(sourceArray);

        System.out.println("\nCopied Array:");
        printArray(destinationArray);
    }

    private static void printArray(int[] array) {
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
