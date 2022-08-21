package practise_java_questions.arrays;

public class ArrayEven {
    public static void main(String[] args) {
        int[] arr = {1, 7, -5, 25, 0, 17, 35, 56, 88, 14, 5, 5, 9, 12, 7};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

