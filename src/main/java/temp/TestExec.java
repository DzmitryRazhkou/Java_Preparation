package temp;

import java.io.IOException;
import java.util.Random;

public class TestExec {
    public static void main(String[] args) throws IOException {
        printPassword(12);
    }

    public static void printPassword(int number) {
        String chars =
                "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_-+=?/<>";
        Random rd = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < number; i++) {
            int randomInt = rd.nextInt(chars.length());
            sb.append(chars.charAt(randomInt));
        }
        System.out.println(sb.toString());
    }
}




