package preparation.integer;

public class CommonElementArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {11, 10, 12, 13, 14, 2, 4, 5};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]){
                    System.out.println("Common element: " +array1[i]);
                }
            }
        }
    }
}
