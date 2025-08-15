package practise_java_questions.Arrays;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsInTwoArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {11, 10, 12, 13, 14, 2, 4, 5};

        commonElementArrayFirstMethod(array1, array2);

        System.out.println("\n__________");

        int[] array = commonElementArraySecondMethod(array1, array2);
        for (int s : array) {
            System.out.print(s);
        }
    }

    private static void commonElementArrayFirstMethod(int[] array1, int[] array2) {
        System.out.println("The Common Elements Are: ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i]);
                }
            }
        }
    }

    private static int[] commonElementArraySecondMethod(int[] array1, int[] array2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> commonSet = new HashSet<>();

        for (Integer s : array1) {
            set.add(s);
        }

        for (Integer f : array2) {
            if (set.contains(f)) {
                commonSet.add(f);
            }
        }

        int[] commonArrayElements = new int[commonSet.size()];
        int count = 0;

        for (int element : commonSet) {
            commonArrayElements[count++] = element;
        }

        return commonArrayElements;
    }
}
