package practise_java_questions.Final_Finally;

public class FinallyConcept {
    public static void main(String[] args) {
        test1();
        test2();
        division();
    }

    public static void test1 (){
        try{
            System.out.println("Inside test1 method");
            throw new RuntimeException("test");
        } catch (Exception e){

        }
        finally {
            System.out.println("Inside finally block");
        }
        System.out.println("__________");
    }

//
    public static void test2 (){
        try {
            System.out.println("Inside test2");
        }
        finally {
            System.out.println("Inside code in test2 method");
        }
        System.out.println("__________");
    }

//
    public static void division (){
        int i = 10;

        try {
            System.out.println("Inside try");
            int s = i/0;
        } catch (ArithmeticException error){

        }
        finally {
            System.out.println("Inside finally");
        }
    }
}
