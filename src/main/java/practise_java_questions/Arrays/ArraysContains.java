package practise_java_questions.Arrays;

public class ArraysContains {
    public static void main(String[] args) {
        int[]a = {1, 5, 10, 15, 25, 9};
        System.out.println(contains(a, 9));
    }
    public static boolean contains(int[]arr, int num){
        for (int s: arr){
            if (s == num){
                return true;
            }
        }
        return false;
    }
}
