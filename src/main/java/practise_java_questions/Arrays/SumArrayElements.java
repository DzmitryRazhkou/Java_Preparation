package practise_java_questions.Arrays;

public class SumArrayElements {
    public static void main(String[] args) {
        // Example array
        int[] array = {19, 75, 99, 175, 795};

        // Calculate the sum of elements in the array
        int sum = sumArrayElements(array);

        // Display the result
        System.out.println("The Sum Of Elements in the Array: " + sum);

        // Last method:
        System.out.println("Hey There: "+addArrayWithoutLoop(new int[] {2, 4, 6, 8}, 0));
    }

    public static int sumArrayElements(int[] arr) {
        int sum = 0;

        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

    public static int addArrayWithoutLoop(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + addArrayWithoutLoop(arr, index + 1);
    }
}
