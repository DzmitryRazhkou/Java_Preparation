package practise_java_questions.integer;

public class _Prime_Interval {
    public static void main(String[] args) {
        int low = 5;
        int high = 70;

        while (low < high) {
            boolean flag = false;

            for (int i = 2; i < low / 2; i++) {
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
