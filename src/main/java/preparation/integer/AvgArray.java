package preparation.integer;

public class AvgArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 4, 3, 100, 125};
        int sum = 0;

        for (int m = 0; m < numbers.length; m++)
            sum = sum + numbers[m];
        double avg = sum/ numbers.length;
        System.out.println(avg);
    }
}
