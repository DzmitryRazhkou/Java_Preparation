package practise_java_questions.Numbers;

public class Remainder {
        public static void main(String[] args) {
            remainderFirstWay(129, 7);
            remainderSecondWay(129, 7);
        }

    private static void remainderFirstWay(int a, int b) {
//        int x = a/b;
        int result = a - (a / b) * b;
        System.out.println("The Remainder is: "+result);
    }
    private static void remainderSecondWay(int a, int b) {
        while (a > b) {
            a = a - b;
        }
        int result = a;
        System.out.println("The Remainder is: "+result);
    }
}
