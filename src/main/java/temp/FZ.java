package temp;

import java.util.*;

public class FZ {
    public static void main(String[] args) {
        String[]d = {"Js", "Js", "Python", "C#", "C++", "Ruby"};
        Object[]f = {1, "Js", 1, 1, "Js" ,"C+" , "C+", 12.6, 12.6};
        remove(f);

        int[]arr = {2, 99, 4, 17};

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                    System.out.println(max);
                }
            }
        }



    public static void remove(Object[] object) {
        Set<Object> set = new HashSet<>();
        for (Object a: object){
            set.add(a);
            }
        set.forEach(f -> System.out.println(f));
        }
    }




//        String[]names = {"JS", "Java", "Python", "C+", "Typescript", "JS"};
//        Set<String> map = new HashSet<>();
//
//        for (String f: names){
//            if (map.add(f) == false){
//                System.out.println(f);
//            }
//        }
//
//    }
//
//        int[] numbers = {1, 3, 5, 6, 2, 3, 19, 99, 175, 375};
//
//        int max = numbers[0];
//        for (int i = numbers.length -1; i > i; i--) {
//            if (numbers[i] < max){
//                max = numbers[i];
//            }
//        }
//        System.out.println(max);



