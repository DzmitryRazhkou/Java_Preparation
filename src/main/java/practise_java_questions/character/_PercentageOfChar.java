package practise_java_questions.character;


public class _PercentageOfChar {

    public static void getCharPercentage(String str) {

        int len = str.length();
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int digits = 0;
        int specChars = 0;

        for (int i = 0; i < len; i++) {
            char sc = str.charAt(i);   // get specific characters

            if (Character.isUpperCase(sc)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(sc)) {
                lowerCaseCount++;
            } else if (Character.isDigit(sc)) {
                digits++;
            } else {
                specChars++;
            }

            double upperCasePercentage = (upperCaseCount * 100) / len;
            double lowerCasePercentage = (lowerCaseCount * 100) / len;
            double digitsPercentage = (digits * 100) / len;
            double specCharPercentage = (specChars * 100) / len;

            System.out.println("In the String: " + str);
//            DecimalFormat decimalFormat = new DecimalFormat("##,##");

            System.out.println("--------");
            System.out.println("Upper case % ---> " + upperCasePercentage);
            System.out.println("Lower case % ---> " + lowerCasePercentage);
            System.out.println("Digits % ---> " + digitsPercentage);
            System.out.println("Specific char % ---> " + specCharPercentage);
            System.out.println("----------");
        }
    }


    public static void main(String[] args) {

        getCharPercentage("Blink 182 - What's my Age Again???");
        getCharPercentage("Didn't even mind?");

    }
}
