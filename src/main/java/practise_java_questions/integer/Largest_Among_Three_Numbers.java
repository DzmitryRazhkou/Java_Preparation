package practise_java_questions.integer;

public class Largest_Among_Three_Numbers {
    public static void main(String[] args) {
        int x = 800;
        int y = 200;
        int z = 500;

        if (x > y && x > z) {
            System.out.println("X is the greatest");
        } else if (y > z) {
            System.out.println("Y is the greatest");
        } else {
            System.out.println("Z is the greatest");
        }

        System.out.println("__________________");

        if (x >= y) {
            if (x >= z) {
                System.out.println("X is the greatest");
            } else {
                System.out.println("Z is the greatest");
            }
        } else {
            if (y >= z) {
                System.out.println("Y is the greatest");
            } else {
                System.out.println("Z is the greatest");
            }
        }
    }
}
