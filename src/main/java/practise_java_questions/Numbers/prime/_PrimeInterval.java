package practise_java_questions.Numbers.prime;

public class _PrimeInterval {
    public static void main(String[] args) {
        int low = 5;
        int high = 70;

        while (low < high) {
            boolean flag = false;

            for (int i = 2; i < low; i++) {
                if (low % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(low + " ");
            }
            low++;
        }
    }
}
