package practise_java_questions.integer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _RepeatNumberCount {
    public static void main(String[] args) {

        getDigitCount(4);

    }

//    121 ---> 1:2,   2:1
//    111 ---> 1:3

    public static void getDigitCount(int number) {

        if (String.valueOf(number).length() == 1) {
            System.out.println(number + " : " +1);
        }

        Map<Integer, Integer> digitMap = new HashMap<>();

        while (number != 0) {   // 121   2) // 12
            int lastDigit = number%10;   // 121%10 = 1   2) 12%10 = 2
            if (digitMap.containsKey(lastDigit)) {
                digitMap.put(lastDigit, digitMap.get(lastDigit) + 1);   // skip to next
                }
            else {
                digitMap.put(lastDigit, 1);   // <1, 1>   2) // <2, 1>
            }
            number = number/10;   // 121/10 ---> 12   ___> again   2) 12/10 = 1
        }

        Set<Integer> keys = digitMap.keySet();
        for (Integer k : keys) {
            System.out.println(" " + k + " : " + digitMap.get(k));
        }

    }

}
