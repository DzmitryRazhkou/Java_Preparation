package preparation.integer;

public class AverageElementOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 9, 12, 20};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int avg = sum/ arr.length;
        System.out.println(avg);
    }

}
