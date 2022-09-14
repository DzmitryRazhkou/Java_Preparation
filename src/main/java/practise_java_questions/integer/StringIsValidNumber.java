package practise_java_questions.integer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringIsValidNumber {

    public static boolean isCorrectPhoneNumber(String number) {

//        return number.matches("[0-9]{10}");

        return number.matches("\\d{10}");
    }

    public static boolean isNumber(String number) {
        try {
            Long.parseLong(number);
            System.out.println("This is a valid number" + number);
        } catch (NumberFormatException e) {
            System.out.println("Not a valid number" +number);
            return false;
        }
        return true;
    }

    public static boolean isValidPhoneNumber(String number) {
        if (number.length() == 10 && isNumber(number)) {
            System.out.println("Valid phone number: " +number);
            return true;
        }
        System.out.println("Not Valid phone number: " +number);
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isNumber("123a"));

        System.out.println(isValidPhoneNumber("2674962519"));
    }

    public static class CurrentTime {
        public static void main(String[] args) {
    //        Calendar cal = Calendar.getInstance();
    //        System.out.println("Current Date and Time: ");
    //        System.out.format("%tB %te, %tY%n", cal, cal, cal);
    //        System.out.format("%tl:%tM %tp%n", cal, cal, cal);
    //
    //        System.out.println("___________________________");

            String pattern = " HH:mm:ss";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
            String date  = simpleDateFormat.format(new Date());
            System.out.println(date);
        }
    }
}
