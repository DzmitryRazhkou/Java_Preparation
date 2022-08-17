package practise_java_questions.tricky;

public class PassNullArgumentWithMethodOverloadingString {
//    **
//    *Pass null argument with method overloading with String and Object types
//    *

//    String as the method overload in child class gets priority

    public static void main(String a[]) {
        test(null);
    }

    public static void test(Object o){
        System.out.println("Object Argument");
    }

    public static void test(String s){
        System.out.println("String Argument");
    }

}
