package practise_java_questions.tricky;

public class NullArgument {

//        Pass null with method overloading with String and Object types

    public static void main(String[] args) {
        test(null);
    }

    public static void test(Object o) {
        System.out.println("Object Argument");
    }

    public static void test(String s) {
        System.out.println("Object Argument");

    }
}
