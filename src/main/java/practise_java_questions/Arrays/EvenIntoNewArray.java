package practise_java_questions.Arrays;

public class EvenIntoNewArray {
    public static void main(String[] args) {
        int[] sourceArray = {1, 7, -5, 25, 0, 17, 35, 56, 88, 14, 5, 5, 9, 12, 7};
        insertEvenIntoNewArray(sourceArray, sourceArray.length);
    }

    public static void insertEvenIntoNewArray(int[] array, int n) {
        int[] new_array = new int[n];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                new_array[j] = array[i];
                j++;
            }
        }
        for (int i = 0; i < new_array.length; i++) {
            System.out.println(new_array[i]);
        }
    }

}
