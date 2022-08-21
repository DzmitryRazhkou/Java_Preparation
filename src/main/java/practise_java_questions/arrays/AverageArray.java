package practise_java_questions.arrays;

public class AverageArray {
    public static void main(String[] args) {
        int[] arr = {3, 9, -1, 0, 12, 59, 10, 75, 13};
        int sum = 0;
        double avg;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + i;
        }
        avg = sum / arr.length;
        System.out.println(avg);
    }
}
