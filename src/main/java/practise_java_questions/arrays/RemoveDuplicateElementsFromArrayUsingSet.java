package practise_java_questions.arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementsFromArrayUsingSet {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 2, 3, 5, 6, 5, 6};

        for (int s : arr){
            System.out.print(" "+s);
        }
        System.out.println("\n________");

        Set <Integer> set = new HashSet<>();
        for (int s : arr){
            set.add(s);
        }
        set.forEach(x -> System.out.print(x+ " "));

        System.out.println("\n________");

        String name[] = {"levic", "Lev", "Levi", "Levic", "Lev"};
        removeDuplicateElementsFromArrayUsingSort(name);

        Integer [] arr1 = {7, 2, 5, 2, 3, 5, 6, 5, 6};
        removeDuplicateElementsFromArrayUsingSort(arr1);
        System.out.println(" " +name);


    }

    public static void removeDuplicateElementsFromArrayUsingSort(Object[] object){
        Set<Object> set = new HashSet<>();
        for (Object a : object){
            set.add(a);
        }
        set.forEach(r-> System.out.println(r+ " "));
    }

}
