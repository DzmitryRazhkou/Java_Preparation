package practise_java_questions.arrays;

public class _SortedArrayFindElementIndex {
    public static void main(String[] args) {
        int[] arr = {12, 89, 9, 767, 45, 5, 1, 2, 7};
        System.out.println(matchElement(arr));
    }

    public static int matchElement(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i) {
                return nums[i];
            }
        }
        return 0;
    }
}
