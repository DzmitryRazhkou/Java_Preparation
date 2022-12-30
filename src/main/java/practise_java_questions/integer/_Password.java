package practise_java_questions.integer;

import java.util.Random;

public class _Password {
    public static void main(String[] args) {
        String s = generatePassword(10);
        System.out.println(s);
    }

    public static String generatePassword(int length) {
        String chars =
                "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_-+=?/<>";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
        return sb.toString();
    }
}
