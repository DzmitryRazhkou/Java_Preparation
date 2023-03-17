package practise_java_questions.integer;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class _ConvertData {
    public static void main(String[] args) throws ParseException {
        String str = "08-04-2022";
        SimpleDateFormat sdf= new SimpleDateFormat("-yyyy");
        Object date = sdf.parse(str);
        System.out.println(date);
    }
}
