package practise_java_questions.tricky;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratePassword {
    public static void main(String[] args) {
        String res = generatePassword(10);
        System.out.println(res);
    }
    public static String generatePassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@!#$%&";
        String password = RandomStringUtils.random(length, characters);

        String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@!#$%&])(?=\\S+$).{10,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            return password;
        } else {
            return generatePassword(length); // recursion
        }
    }
}
