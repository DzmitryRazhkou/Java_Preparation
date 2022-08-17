package practise_java_questions.tricky;

public class WillStaticBlockbeExecutedWithFinalVariable {
    public static void main(String[] args) {

        System.out.println(main.x);

    }
}
    class main {
    public static final int x = 100;
    static {
        System.out.println("main ___ class static block...");
    }
}
