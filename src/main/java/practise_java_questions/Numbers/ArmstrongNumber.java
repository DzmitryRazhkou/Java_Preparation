package practise_java_questions.Numbers;

public class ArmstrongNumber {
    public static void main(String[] args) {
        isArmstrongNumber(153);
    }

    private static void isArmstrongNumber(int number) {
        double cub = 0;
        int originalNumber = number;

        while (number != 0) {
            int reminder = number % 10;
            cub += Math.pow(reminder, 3);
            number /= 10;
        }

        if (cub == originalNumber) {
            System.out.println("The " + cub + " is Armstrong!!!");
        } else {
            System.out.println("The " + cub + " is Not Armstrong!!!");
        }
    }
}
