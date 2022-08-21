package practise_java_questions.arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 7, -5, 25, 0, 17, 35, 56, 88, 14, 5, 5, 9, 12, 7};
        reverseArray(arr, arr.length);
    }

    public static void reverseArray(int[] arr, int n) {
        int[] rev_arr = new int[n];
        int j = n;

        for (int i = 0; i < n; i++) {
            rev_arr[j - 1] = arr[i];
            j = j -1;
        }
        for (int k = 0; k < n; k++) {
            System.out.println(rev_arr[k]);
        }
    }
}
