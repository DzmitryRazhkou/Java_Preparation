package temp;

import javax.management.MBeanAttributeInfo;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RANDOM {
    public static void main(String[] args) {
        duplicate("E deee rfffdfggg");
    }

    public static void duplicate(String str){
        char[]ar = str.toCharArray();
        Map<Character, Integer> map =  new HashMap<>();
        for (Character s: ar) {
            if (map.containsKey(s)){
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        Set<Character> setChar = map.keySet();
        for (Character f: setChar){
            if (map.get(f) > 1){
                System.out.println(f+ " " +map.get(f));
            }
        }
    }


//    public static void percentage(String str){
//        int len = str.length();
//        int upperCount = 0;
//        int lowerCount = 0;
//        int digit = 0;
//        int spec = 0;
//
//        for (int i = 0; i < len; i++) {
//            char sc = str.charAt(i);
//
//            if (Character.isUpperCase(sc)){
//                upperCount++;
//            } else if (Character.isLowerCase(sc)) {
//                lowerCount++;
//            } else if (Character.isDigit(sc)) {
//                digit++;
//            } else {
//                spec++;
//            }
//        }
//
//        double upperPercentage = (upperCount * 100)/len;
//        double lowerPercentage = (lowerCount * 100)/len;
//        double digitPercentage = (digit * 100)/len;
//        double specPer = (spec * 100)/len;
//
//        System.out.println("In the String: " + str);
//
//
//            System.out.println("--------");
//            System.out.println("Upper case % ---> " + upperPercentage);
//            System.out.println("Lower case % ---> " + lowerPercentage);
//            System.out.println("Digits % ---> " + digitPercentage);
//            System.out.println("Specific char % ---> " + specPer);
//            System.out.println("----------");
    }



