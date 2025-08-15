package practise_java_questions.Arrays;

public class AverageArrayNumber {
    public static void main(String[] args) {
        int[] arr = {3, 11, -1, 0, 12, 79, 77, 10, 75, 13};
        averageArrayNumber(arr);
    }

    private static void averageArrayNumber(int[] array) {
        int sum = 0;
        double avg;

        for (int i = 0; i < array.length; i++) {
            sum += i;
        }
        avg = (double) sum / array.length;
        System.out.println("The Average Number From Array is: " + avg);
    }
}
