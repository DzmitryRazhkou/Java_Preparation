package practise_java_questions.integer;

public class Swap_Two_Numbers {
    public static void main(String[] args) {
        int a = 15;
        int b = 35;

//      Without Temporary
        System.out.println("Before Swapping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = a + b;
        a = b - a;
        b = b - a;

        System.out.println("After Swapping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
