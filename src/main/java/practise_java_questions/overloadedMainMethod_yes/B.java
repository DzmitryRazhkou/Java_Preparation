package practise_java_questions.overloadedMainMethod_yes;

public class B {
    public static void main(String[] args) {
        System.out.println("B -> main method");
        A.main(args);
    }
}
