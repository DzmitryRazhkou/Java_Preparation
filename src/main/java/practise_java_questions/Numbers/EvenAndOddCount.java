package practise_java_questions.Numbers;

public class EvenAndOddCount {
    public static void main(String[] args) {
        int[] array = digitToArray(875345678);
        evenAndOddCountNumbers(array);
        qa(987666);
    }


    private static int[] digitToArray(int number) {
        int count = (int) Math.log10(number) + 1;

        int[] digits = new int[count];

        int temporary = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temporary % 10;
            temporary /= 10;
        }
        return digits;

        // Print the digits array
//        System.out.println("The digits in the number " + number + " are:");
//        for (int digit : digits) {
//            System.out.print(digit + " ");
//        }

    }

    private static void evenAndOddCountNumbers(int[] array) {
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("The Amount Of The Even Numbers is: " + countEven + ", The Amount Of The Odds Ones Is: " + countOdd);
    }

    public static int[] convertToDigitsArray(int number) {
        String numberStr = Integer.toString(Math.abs(number));
        int[] digits = new int[numberStr.length()];

        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = numberStr.charAt(i) - '0';  // Convert char to int
        }

        return digits;
    }

    public static void qa(int num) {
        String numberString = Integer.toString(Math.abs(num));
        int[] array = new int[numberString.length()];

        for (int i = 0; i < numberString.length(); i++) {
            array[i] = numberString.charAt(i) - '0';
        }

        for (Integer s : array) {
            System.out.print(s + " ");
        }
    }
}
