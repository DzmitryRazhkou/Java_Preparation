package temp;


import java.util.*;

public class S {
    public static void main(String[] args) {
        String f = "NfkPLo";

        int count = 0;
        for (int i = 0; i < f.length(); i++) {
            if (f.charAt(i) >= 'A' && f.charAt(i) <= 'Z'){
                count++;
            }
        }
        System.out.println(count);

        int count2 = 0;
        for (int i = 0; i < f.length(); i++) {
            if (Character.isUpperCase(f.charAt(i))){
                count2++;
            }
        }
        System.out.println(count2);

    }
}

