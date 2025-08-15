package practise_java_questions.Numbers;

public class PowerNumber {
    public static void main(String[] args) {
        // Input base and exponent
        double base = 5;
        int exponent = 3;

        // Calculate power
        double result = calculatePower(base, exponent);

        // Display the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

//    Function to calculate power using a loop
    private static double calculatePower(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        double result = 1;

        for (int i = 1; i <= Math.abs(exponent); i++) {
            result *= base;
        }

        // Adjust the result based on whether the exponent is positive or negative
        return (exponent > 0) ? result : 1 / result;
    }
}
