package practise_java_questions.principles.overloadedMainMethod_yes;

public class A {
    public static void main(String[] args) {
        System.out.println("A -> main method");
        B.main(args);
    }
}
