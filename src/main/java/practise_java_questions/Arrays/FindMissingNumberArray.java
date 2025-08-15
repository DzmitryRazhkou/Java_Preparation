package practise_java_questions.Arrays;

public class FindMissingNumberArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 6};
        findMissingNumber(a);

    }

    public static void findMissingNumber(int[] array) {
        int n = array.length + 1; // The array is missing one element, so total count should be +1
        int expectedSum = n * (n + 1) / 2; // Sum formula for the first n natural numbers
        int actualSum = 0;

        for (int num : array) {
            actualSum += num; // Sum up all elements in the array
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("The missing number is: " + missingNumber);
    }
}
