package temp;

import java.io.IOException;
import java.util.*;

public class TestExec {
    public static void main(String[] args) throws IOException {
        String y = "gans automation labs gAns lABS auto zec Zec Yet YET";
//        countWords(y);
        int[] rs = {1, 23, 5, 15, 5, 7, 12, 12, 15, 75, 99};
        String[] wors = {"Hi", "NJ", "PA", "CA", "CA", "FL", "FL"};
        String str = "XCUITest Appium Playwright";
        String password = psw(20);
        System.out.println(password);

        leapYear(2020);
        greaterNumber(190, 900, 5);
        remainder(129, 7);
        boolean s = anagramString("taste", "state");
        System.out.println(s);

        countNumbersInteger(198754117);
        generateRandomNumber(90);

        longestWord(str);
        boolean palindromeString = palindromeString("uou");
        System.out.println("OP is: " + palindromeString);

        capitalizeWords("xcuitest appium cypress");

        passwtrdRand(12);
        isArm(121);

        reverseNumber(98765443);

        loop(9);
        summarizedInt(9087432);

        remainder(129, 7);
        countDigitsInteger(200);
        int sf = summarizeRecursion(109);
        System.out.println(sf);
    }

    public static void showDuplicatedShit(Integer[] array) {
        List<Integer> list = Arrays.asList(array);
        Set<Integer> set = new HashSet<>(list);

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

    public static void showDuplicatedWords(String[] words) {
        Set<String> store = new HashSet<>();
        for (String j : words) {
            if (!store.add(j)) {
                System.out.println("Duplicated States: " + j);
            }
        }
    }

    public static void maxNumber(Integer[] array) {

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < max) {
                max = array[i];
            }
        }
        System.out.println(max);

    }

    public static void reversedArray(String str) {
        String[] strArr = str.split("\\s");
        Arrays.sort(strArr);

        StringBuilder reversed = new StringBuilder();
        for (String s : strArr) {
            StringBuilder rev = new StringBuilder();
            for (int i = s.length() - 1; i >= 0; i--) {
                rev.append(s.charAt(i));
            }
            reversed.append(rev).append(" ");
        }
        System.out.println(reversed.toString().trim());
    }

    public static void maxArray(int[] array, int n) {
        Arrays.sort(array);
        int[] n_maxArray = new int[n];
        for (int i = 0; i < n; i++) {
            n_maxArray[i] = array[array.length - i - 1];
        }

        for (int i = 0; i < n_maxArray.length; i++) {
            System.out.println(n_maxArray[i]);
        }
    }

//    public static void revArray(int[] arr, int n) {
//        int[] new_arr = new int[n];
//        int j = n;
//
//        for (int i = 0; i < n; i++) {
//            new_arr[j - 1] = arr[i];
//            j = j - 1;
//        }
//        for (int u = 0; u < n; u++) {
//            System.out.println("XV: " + new_arr[u]);
//        }
//    }

    //    Integer:
    public static void fizzBuzz(int bound) {
        for (int i = 0; i < bound; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Fizz Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void summarizedInt(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("The Summarize Number is: " + sum);
    }

    public static void loop(int number) {
        int y = 0;
        while (y <= number) {
            System.out.println(y);
            y++;
        }
        System.out.println("DONE!!!");
    }

    public static String psw(int length) {
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

    public static void multipleTable(int number) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void oneHundred() {
        int one = 'f' / 'f';
        StringBuilder sb = new StringBuilder();
        sb.append(",/.'[]()_+");

        for (int i = one; i <= 'd'; i++) {
            System.out.println(i);
        }
    }

    public static void countNumbersInteger(int number) {
        if (String.valueOf(number).length() == 1) {
            System.out.println(number + " ---> " + 1);
        }

        Map<Integer, Integer> maps = new HashMap<>();
        while (number != 0) {
            int last = number % 10;
            if (maps.containsKey(last)) {
                maps.put(last, maps.get(last) + 1);
            } else {
                maps.put(last, 1);
            }
            number /= 10;
        }
        Set<Map.Entry<Integer, Integer>> y = maps.entrySet();
        for (Map.Entry<Integer, Integer> s : y) {
            if (s.getValue() > 1) {
                System.out.println(s.getKey() + " ---> " + s.getValue());
            }
        }
    }

    public static int sum(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public static void countDigitsInteger(int num) {
        int counter = 0;
        while (num != 0) {
            num /= 10;
            counter++;
        }
        System.out.println("The Numbers Of Digits is: " + counter);
    }

    public static void leapYear(int year) {
        boolean a = year % 4 == 0;
        boolean b = year % 100 != 0;
        boolean c = (year % 100 == 0) && (year % 400 == 0);

        if (a & (b || c)) {
            System.out.println("Yeah");
        } else {
            System.out.println("No Yeah");
        }
    }

    public static void greaterNumber(int z1, int z2, int z3) {
        if (z1 > z2 && z1 > z3) {
            System.out.println("X is the greater");
        } else if (z2 > z3) {
            System.out.println("Y is the greater");
        } else {
            System.out.println("Z is the greater");
        }
    }

    public static void remainder(int y, int z) {
//        int res = y - (y / z) * z;
//        System.out.println("The Remainder is: " + res);
        while (y > z) {
            y = y - z;
        }
        System.out.println("Thre Result is: " + y);
    }

    public static void isArm(int num) {
        int cube = 0;
        int reminder, temp;

        temp = num;

        while (num != 0) {
            reminder = num % 10;
            cube = cube * 10 + reminder;
            num /= 10;
        }
        if (cube == temp) {
            System.out.println("It's Arm");
        } else {
            System.out.println("It's Not Arm");
        }
    }

    public static void reverseNumber(int number) {
        int reminder;
        int reversedNumber = 0;

        while (number != 0) {
            reminder = number % 10;
            reversedNumber = reversedNumber * 10 + reminder;
            number /= 10;
        }
        System.out.println("P is: " + reversedNumber);
    }

    public static int summarizeRecursion(int num) {
        if (num != 0) {
            return num + summarizeRecursion(num - 1);
        } else {
            return num;
        }
    }

    //    String:
    public static boolean anagramString(String w1, String w2) {
        if (w1.length() != w2.length()) {
            return false;
        }

        w1 = w1.replaceAll("\\s", "").toLowerCase();
        w2 = w2.replaceAll("\\s", "").toLowerCase();

        char[] w_1 = w1.toCharArray();
        char[] w_2 = w2.toCharArray();

        Arrays.sort(w_1);
        Arrays.sort(w_2);

        return Arrays.equals(w_1, w_2);
    }

    public static void countWord(String string) {
        string = string.toLowerCase();
        String[] sort = string.split("\\s");

        Map<String, Integer> maps = new HashMap<>();
        for (String s : sort) {
            if (maps.containsKey(s)) {
                maps.put(s, maps.get(s) + 1);
            } else {
                maps.put(s, 1);
            }
        }
        Set<Map.Entry<String, Integer>> se = maps.entrySet();
        for (Map.Entry<String, Integer> y : se) {
            if (y.getValue() > 1) {
                System.out.println(y.getKey() + " ---> " + y.getValue());
            }
        }
    }

    public static void generateRandomNumber(int number) {
        Random rd = new Random();
        int random = rd.nextInt(number) + 1;
        System.out.println("R is: " + random);
    }

    public static void longestWord(String str) {
        List<String> list = new ArrayList<>();
        String longest = "";
        String[] store = str.split("\\s");

        for (int i = 0; i < store.length; i++) {
            if (store[i].length() >= longest.length()) {
                longest = store[i];
                list.add(longest);
            }
        }
        System.out.println("The Longest Word In the Sentence is: " + list.toString());
    }

    public static boolean palindromeString(String string) {
        String rev = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            rev += string.charAt(i);
        }
        return (rev.toLowerCase().equals(string.toLowerCase()));
    }

    public static void capitalizeWords(String str) {
        StringBuilder sb = new StringBuilder();
        String[] store = str.split("\\s");

        for (String s : store) {
            StringBuilder fs = new StringBuilder();
            fs.append(s.substring(0, 2).toUpperCase() + s.substring(2));
            sb.append(fs).append(" ");
        }
        System.out.println(sb.toString());
    }

    public static void reverseChar(String string) {
        char[] chars = string.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }

    public static void passwtrdRand(int length) {
        String chars = "0986756etdfgvhbjhugfgd~!@#$%^&*(*()";
        StringBuilder sb = new StringBuilder();
        Random rd = new Random();

        for (int i = 0; i < length; i++) {
            int random = rd.nextInt(chars.length());
            sb.append(chars.charAt(random));
        }
        System.out.println(sb.toString());
    }
//    public static void countWords(String str) {
//        str = str.toLowerCase();
//        String[] words = str.split("\\s");
//        Arrays.sort(words);
//
//        Map<String, Integer> maps = new HashMap<>();
//        for (String s : words) {
//            if (maps.containsKey(s)) {
//                maps.put(s, maps.get(s) + 1);
//            } else {
//                maps.put(s, 1);
//            }
//        }
//        Set<String> y = maps.keySet();
//        for (String s : y) {
//            if (maps.get(s) > 1) {
//                System.out.println(s + " -> " + maps.get(s));
//            }
//        }
//    }
//
//    public static void reverseArray(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            int current = arr[i];
//            int j = i - 1;
//
//            while (j >= 0 && arr[j] > current) {
//                arr[j + 1] = arr[j];
//                j--;
//            }
//            arr[j + 1] = current;
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//
//    public static void isPalindrome(int num) {
//        int reminder, temp, cube = 0;
//
//        temp = num;
//        while (num != 0) {
//            reminder = num % 10;
//            cube = cube * 10 + reminder;
//            num /= 10;
//        }
//        if (cube == temp) {
//            System.out.println("Y");
//        } else {
//            System.out.println("N");
//        }
//    }
}

