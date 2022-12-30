package practise_java_questions.integer;

public class _SwapTwoNumbersUsingTemp {
    public static void main(String[] args) {
        int first = 100;
        int second = 200;

        System.out.println("1st Value Before Swapping" + " " + first);
        System.out.println("2nd Value Before Swapping" + " " + second);
        System.out.println("---------");

        int temp = first;
        first = second;
        second = temp;

        System.out.println("1st Value After Swapping" + " " + first);
        System.out.println("2nd Value After Swapping" + " " + second);

    }

}
