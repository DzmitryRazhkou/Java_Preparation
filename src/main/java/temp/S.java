package temp;


import java.util.HashSet;
import java.util.Set;

public class S {
    public static void main(String[] args) {
        Integer[] arr = {1, 7, -5, 25, 0, 17, 35, 56, 88, 14, 5, 5, 9, 12, 7};
        Set<Integer> set = new HashSet<>();

        for (Integer s: arr){
                if (set.add(s) == false){
                    System.out.println(s);
                }
            }
        }
    }





