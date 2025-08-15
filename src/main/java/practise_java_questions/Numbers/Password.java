package practise_java_questions.Numbers;

import java.util.Objects;
import java.util.Random;

public class Password {
    public static void main(String[] args) {
//        String s = generatePassword(10);
//        System.out.println(s);
        String[] chars = {"!", "@", "$", "&", "%", "<", ">", "?", "/", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"};
        generateSecurePassword(chars, 100);
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

    public static void generateSecurePassword(Object[] objects, int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(objects.length);
            sb.append(objects[randomIndex]);
        }
        System.out.println(sb.toString());
    }
}
