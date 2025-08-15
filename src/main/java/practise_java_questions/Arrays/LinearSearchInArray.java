package practise_java_questions.Arrays;

public class LinearSearchInArray {
    public static void main(String[] args) {
        int[] array = {12, 75, 90, 175, 375, 19};
        int result = linearSearchingArray(array, 175);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    private static int linearSearchingArray(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                // Element found, return its index
                return i;
            }
        }
        // Element not found in the array
        return -1;
    }
}
