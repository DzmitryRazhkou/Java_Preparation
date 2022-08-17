package practise_java_questions.arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayToString {
    public static void main(String[] args) {
        String[]arr = {"y" , "z", "t", "v"};
        String str = String.join("_", arr);
        System.out.println(str);

        System.out.println("______");

        String join = Arrays.asList("A", "W", "S", " ", "E", "C", "2")
                .stream()
                .collect(Collectors.joining(""));
        System.out.println(join);

        String join_ = Arrays.asList("05", "28", "1990")
                .stream()
                .map(e ->String.valueOf(e))
                .collect(Collectors.joining("/"));
        System.out.println(join_);


    }
}
