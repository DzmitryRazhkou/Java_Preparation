package practise_java_questions.Numbers;

import java.util.*;

public class RepetitiveNumbersThruSetList {
    public static void main(String[] args) {
        Integer[] numbers = {1, 5, 5, 89, 15, 12, 55, 99, 12, 75, 75, 12};
        repetitiveNumbersThruListSet(numbers);
        countNumbersInteger(2346896);

        rep(numbers);
    }

    //    Find Repetitive Numbers from Array:
    public static void repetitiveNumbersThruListSet(Integer[] array) {
        List<Integer> list = Arrays.asList(array);
        Set<Integer> set = new HashSet<>(Arrays.asList(array));

        for (Integer s : set) {
            int count = 0;
            for (Integer l : list) {
                if (s == l) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(s);
            }
        }
    }

    //    Count Repetitive With Using HashMap:
    public static void countNumbersInteger(int number) {

        //    121 ---> 1:2,   2:1
        //    111 ---> 1:3

        if (String.valueOf(number).length() == 1) {
            System.out.println(number + " -> " + 1);
        }

        Map<Integer, Integer> maps = new HashMap<>();
        while (number != 0) {   // 121   2) // 12
            int lastDigit = number % 10;   // 121%10 = 1   2) 12%10 = 2

            if (maps.containsKey(lastDigit)) {
                maps.put(lastDigit, maps.get(lastDigit) + 1);   // skip to next
            } else {
                maps.put(lastDigit, 1);   // <1, 1>   2) // <2, 1>
            }
            number = number / 10;   // 121/10 ---> 12   ___> again   2) 12/10 = 1
        }

        Set<Map.Entry<Integer, Integer>> set = maps.entrySet();
        for (Map.Entry<Integer, Integer> s : set) {
            if (s.getValue() > 1) {
                System.out.println(s.getKey() + " -> " + s.getValue());
            }
        }
    }

    public static void rep(Integer[] array) {
        List<Integer> list = Arrays.asList(array);
        Set<Integer> set = new HashSet<>(list);

        for (Integer s: set) {
            int count = 0;

            for (Integer l: list) {
                if (s == l) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("The " + s + " is Not Palindrome Number!!!");
            }
        }
    }

}

