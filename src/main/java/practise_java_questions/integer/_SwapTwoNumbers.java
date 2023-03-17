package practise_java_questions.integer;

public class _SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 15;
        int b = 35;

        swappingWithOutTemporary(a, b);
        swappingWithTemporary(a, b);
    }

    public static void swappingWithOutTemporary(int a, int b) {
        System.out.println("WithOut Temporary Before Swapping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = a + b;
        a = b - a;
        b = b - a;

        System.out.println("WithOut Temporary Before Swapping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void swappingWithTemporary(int a, int b) {
        int temporary;
        System.out.println("With Temporary Before Swapping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        temporary = a;
        a = b;
        b = temporary;

        System.out.println("With Temporary Before Swapping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
