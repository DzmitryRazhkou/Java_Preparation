package practise_java_questions.integer;

public class MaxNumberWhereeThreeDifferent {
    public static void main(String[] args) {
        int x = 1000;
        int y = 900;
        int z = 300;

        if (x>y && x>z){
            System.out.println("X is the greater");
        } else if (y>z){
            System.out.println("Y is the greater");
        } else {
            System.out.println("Z is the greater");
        }
    }
}
