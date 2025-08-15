package practise_java_questions.Arrays;

import java.util.Arrays;

public class NthLargestIntegerArray {
    public static void main(String[] args) {
        int[] arr = {1, 7, -5, 25, 0, 17, 35, 56, 88, 14, 5, 5, 9, 12, 7};

        n_maxElement(arr, 3);
        n_maxElementsArray(arr, 3);
    }

    public static void n_maxElement(int[] array, int n) {
        Arrays.sort(array);
        int max = array[array.length - n];
        System.out.println("The " + n + "-max element is: " + max);
    }

    public static void n_maxElementsArray(int[] array, int n) {
//        Sort The Array in Descending Order:
        Arrays.sort(array);
        int[] n_maxArray = new int[n];
        for (int i = 0; i < n; i++) {
            n_maxArray[i] = array[array.length - i - 1];
        }

//        Print The n_max Elements:
        System.out.println("The " + n + "rd max elements are: ");
        for (int i = 0; i < n_maxArray.length; i++) {
            System.out.print(n_maxArray[i] + " ");
        }
    }
}

