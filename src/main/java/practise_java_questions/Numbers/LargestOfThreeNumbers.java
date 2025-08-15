package practise_java_questions.Numbers;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int x = 1000;
        int y = 900;
        int z = 300;

        largestOfThreeNumbers(x, y, z);
    }

    private static void largestOfThreeNumbers(int x, int y, int z) {
        if (x > y && x > z) {
            System.out.println("X=" + x + " is the greater");
        } else if (y > z) {
            System.out.println("Y=" + y + " is the greater");
        } else {
            System.out.println("Z=" + z + " is the greater");
        }
    }
}
