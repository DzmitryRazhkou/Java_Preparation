package practise_java_questions.tricky;

public class StaticBlock {

    static {
        System.out.println("static block1");
    }

    static {
        System.out.println("static block2");
    }

    static {
        System.out.println("static block3");
    }



    public static void main(String[] args) {
        System.out.println("Method");
    }

    static {
        System.out.println("static block4");
    }
}
