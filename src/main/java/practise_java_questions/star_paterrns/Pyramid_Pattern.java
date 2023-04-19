package practise_java_questions.star_paterrns;

public class Pyramid_Pattern {
    public static void main(String[] args) {
//        printPyramidPattern(12);
//        System.out.println("\n");
//        printPatternTriangle(5);
//        System.out.println("\n");
//        printPatternTriangleOpposite(5);
//        System.out.println("\n");
        printPyramidOppositePattern(5);
    }

    public static void printPyramidPattern(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = number; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
    public static void printPatternTriangle(int number) {
        for (int i = 0; i <= number; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
    public static void printPatternTriangleOpposite(int number) {
        for (int i = 0; i <= number; i++) {
            for (int j = number; j >= i; j--) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
    public static void printPyramidOppositePattern(int number) {
        for (int i = 0; i <= number; i++) {
            for (int j = number; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
}
