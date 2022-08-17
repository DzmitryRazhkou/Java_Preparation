package preparation.integer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CurrentTime {
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
