package practise_java_questions.principles.overloadedMainMethod_yes;

public class Test {
    public static void main(String[] args) {
        System.out.println("main method ---> 1");
        main(10);
        main("Test");
    }

    public static void main(String text) {
        System.out.println("main method ---> 2");
    }

    public static void main(int num) {
        System.out.println("main method ---> 3");
    }
}
