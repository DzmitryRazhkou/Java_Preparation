package practise_java_questions.integer;

public class _SwapTwoNumbersWithoutTemp {
    public static void main(String[] args) {
        int a = 25;
        int b = 35;

        System.out.println("1st Value Before Swapping" +" " + a);
        System.out.println("2nd Value Before Swapping" +" " + b);
        System.out.println("---------");

        a = a + b;   // a = 50;
        b = a - b;   // b = 25;
        a = a - b;   // a = 35;

        System.out.println("1st Value After Swapping" +" " + a);
        System.out.println("1st Value After Swapping" +" " + b);

    }
}
