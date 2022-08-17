package practise_java_questions.Exceptions_Static;

public class App_Exceptions {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try{
            int x = a/b;
        } catch (ArithmeticException err){
            System.out.println(err.getMessage());
        } finally {
            System.out.println("Run any case");
        }

    }
}
