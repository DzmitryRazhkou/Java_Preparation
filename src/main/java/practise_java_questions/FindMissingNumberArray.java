package practise_java_questions;

public class FindMissingNumberArray {
    public static void main(String[] args) {
        int[]a = {1, 2, 3, 4, 6};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.println(i);

            sum = sum + a[i];
        }
        System.out.println(sum);

        System.out.println("-----------");

    int sum1 = 0;
    for (int j = 1; j <= 6; j++){
        sum1 = sum1 + j;
    }
        System.out.println(sum1);
        System.out.println("Missing number is: " + (sum1 - sum));

    }
}
