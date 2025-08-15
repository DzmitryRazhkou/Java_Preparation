package practise_java_questions.Arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayToString {
    public static void main(String[] args) {
        String[] stringArray = {"Car", "W", "S", " ", "E", "C", "2"};
        System.out.println("______");
        joinString(stringArray);
        joinStringBuilder(stringArray);
        joinArrayListCollectors(stringArray);
    }

    public static void joinString(String[] str) {
        String result = String.join("", str);
        System.out.println("The String Way Joining is: " + result);
    }
    public static void joinStringBuilder(String[] str) {
        StringBuilder sb = new StringBuilder();
        for (String s : str) {
            sb.append(s);
        }
        System.out.println("The StringBuilder Way Joining is: " + sb);
    }
    public static void joinArrayListCollectors(String[] str){
        String result = Arrays.stream(str)
                .collect(Collectors.joining(""));
        System.out.println("The Stream Collectors Way Joining is: "+result);
    }
}
