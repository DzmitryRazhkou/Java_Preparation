package practise_java_questions.Arrays;

import java.util.Arrays;

public class MoveNegativesToStart {
    public static void main(String[] args) {
        int[] intArray = {197, 275, 0, 12, 7, 50, 37, -175, -120, -9};

        System.out.println("Original Array: " + Arrays.toString(intArray));

        moveNegativesToStart(intArray);

        System.out.println("Array after moving negatives to start: " + Arrays.toString(intArray));
    }

    private static void moveNegativesToStart(int[] array) {
        int negIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                // Swap the current element with the element at negIndex
                int temp = array[i];
                array[i] = array[negIndex];
                array[negIndex] = temp;

                // Move the negative index to the next position
                negIndex++;
            }
        }
    }
}
