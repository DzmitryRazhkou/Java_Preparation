package practise_java_questions.tricky;

public class Label {
    public static void main(String[] args) {
        System.out.println("Hello");
        naveen: //google.com
        System.out.println("OK! Bye");

        task:
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
            if (i ==5){
                break task;
            }
        }
    }
}
