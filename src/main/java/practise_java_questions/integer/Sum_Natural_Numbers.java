package practise_java_questions.integer;

public class Sum_Natural_Numbers {
    public static void main(String[] args) {
        int sum = 0;
        int num = 97;
        for (int i = 1; i<=num; i++){
            sum = sum + i;
        }
        System.out.println("Sum is: " +sum);

        System.out.println("-------------");

        int z = 1;
        int sum1 = 0;
        while (z<=num) {
            sum1 = sum1 + z;
            z++;
        }
        System.out.println("Sum is: " +sum1);
    }

}
