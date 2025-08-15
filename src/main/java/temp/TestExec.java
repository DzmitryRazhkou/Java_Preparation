package temp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestExec {
    public static void main(String[] args) throws IOException {
        String y = "gans automation";
        String reverse = "XCUITest Expresso Cypress 101 $!";
//        countWords(y);
        Integer[] rs = {12, 9, 2, 5, 15, 5, -0, -125, 0, 15, 15, 75, -99};
        int[] arr = {3, 10, 15, 19, 20, 19};
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_-+=?/<>";

        Integer[] arr1 = {3, 10, 15, 19, 20, 19};
        int[] arr2 = {3, 10, 25, 19, 35, 19};
        int[] a = {1, 2, 3, 4, 6};

        String text = "This is a simple example Chinese Radicals 汉字偏旁部首. Example $@ words WOrds have even count.";
        String inputSentence = "This is a sample sentence with duplicate words. This is a sample sentence.";

        String[] wors = {"Hi", "NJ", "PA", "CA", "CA", "FL", "FL"};
        String str = "XCUITest Appium Playwright";
        String path = "/Users/dzmitryrazhkou/Downloads/Unknown.pdf";

        reverseEachWordStrin("Lexus GX 450");

        //*
        // *//
    }


    //*
    //
    // *//

    public static void reverseEachWordStrin(String str) {
        String entireReversedString = "";
        String[] wordsArray = str.toLowerCase().split("\\s+");

        for (String s : wordsArray) {
            String reversedWord = "";

            for (int i = s.length() - 1; i >= 0; i--) {
                reversedWord += s.charAt(i);
            }
            entireReversedString += reversedWord + " ";
        }
        System.out.println(">>>> " + entireReversedString);
    }

    public static void sr(Object[] object) {
        char[] wes = object.toString().toCharArray();


    }

    public static void countWordsInFile(String path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String currentLine = bufferedReader.readLine();
        String[] words = currentLine
                .toLowerCase()
                .split("\\s+");

        Map<String, Integer> wordsMap = new HashMap<>();
        while (currentLine != null) {
            for (String s : words) {
                wordsMap.put(s, wordsMap.getOrDefault(s, 0) + 1);
            }

            currentLine = bufferedReader.readLine();
        }

        Set<String> keys = wordsMap.keySet();
        for (String s : keys) {
            if (wordsMap.get(s) > 1) {
                System.out.println(s + " ---> " + wordsMap.get(s));
            }
        }


    }

    public static void removeDuplicateCharacters(String string) {
        Set<Character> uniqueChar = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        string = string.replace(" ", "").toLowerCase();

        for (Character s : string.toCharArray()) {
            if (uniqueChar.add(s)) {
                sb.append(s).append(" ");
            }
        }
        System.out.println("Result is: " + sb.toString());
    }

    public static void reverseString(String str) {

        System.out.println("The Reversed String Using StringBuilder is: ");

        for (int i = str.toCharArray().length - 1; i >= 0; i--) {
            System.out.print(str.toCharArray()[i]);
        }
    }

    public static void tsr(String str) throws IOException {
        Map<String, Integer> amps = new HashMap<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
        String currentLine = bufferedReader.readLine();

        String[] words = currentLine.toLowerCase().split(" ");

        while (currentLine != null) {
            for (String s : words) {
                amps.put(currentLine, amps.getOrDefault(currentLine, 0) + 1);
            }
            currentLine = bufferedReader.readLine();
        }

        Set<Map.Entry<String, Integer>> entrySet = amps.entrySet();
        for (Map.Entry<String, Integer> f : entrySet) {
            if (f.getValue() > 1) {
                System.out.println(f.getKey() + " -> " + f.getValue());
            }
        }
    }

    public static void generatePsw(int length, String chars) {
        Random rd = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = rd.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
        System.out.println(sb.toString());
    }

    public static boolean isPerfectSquare(int number) {
        if (number < 0) {
            return false;
        }

        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }

    public static void duplicateCharacter(String str) {
        char[] words = str.toLowerCase().replace("\\s", "").toCharArray();
        Arrays.sort(words);

        Map<Character, Integer> characters = new HashMap<>();

        for (Character s : words) {
            characters.put(s, characters.getOrDefault(s, 0) + 1);
        }

        Set<Map.Entry<Character, Integer>> sd = characters.entrySet();
        for (Map.Entry<Character, Integer> s : sd) {
            if (s.getValue() > 1) {
                System.out.println(s.getKey() + " --->>> " + s.getValue());
            }
        }

//        Set<Character> set = maps.keySet();
//        for (char s : set) {
//            if (maps.get(s) > 1) {
//                System.out.println(s + " -> " + maps.get(s));
//            }
//        }
    }

    public static void countVowelsString(String s) {
        s = s.toLowerCase();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char y = s.charAt(i);

            if (y == 'a' || y == 'e' || y == 'u' || y == 'o' || y == 'i') {
                count++;
            }
        }

        System.out.println("The Amount of Vowels Chars is: " + count);
    }

    public static void countCapitalLetters(String str) {
        int count = 0;

        for (int i = 0; i < str.toCharArray().length; i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                count++;
            }
        }
        System.out.println("The Capit Count: " + count);
    }

    public static void removeDuplicateElementsFromArrayUsingSort(Object[] object) {
        Set<Object> set = new HashSet<>();

        for (Object s : object) {
            set.add(s);
        }
        set.forEach(s -> System.out.println(s + " "));
    }

    public static void commonElementArraySecondMethod(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> commonSet = new HashSet<>();

        for (Integer s : arr1) {
            set.add(s);
        }

        for (Integer f : arr2) {
            if (set.contains(f)) {
                commonSet.add(f);
            }
        }

        int[] commonArray = new int[commonSet.size()];
        int count = 0;

        for (Integer g : commonSet) {
            commonArray[count++] = g;
        }

        for (int i = 0; i < commonArray.length; i++) {
            System.out.print(commonArray[i]);
        }
    }

    public static void showDuplicateNumbersArray(Integer[] numbers) {
        List<Integer> list = Arrays.asList(numbers);
        Set<Integer> set = new HashSet<>(list);

        for (Integer s : set) {
            int count = 0;

            for (Integer l : list) {
                if (s == l) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println("The Duplicated Number Is: " + s + " <<<<<");
            }
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void countOccurrencesToCharArray(String input, char s) {
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == s) {
                count++;
            }
        }
        System.out.println("The Amount is: " + count);
    }

    public static void maxWordCountFile(String path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String currentLine = bufferedReader.readLine();

        String[] words = currentLine.toLowerCase().split(" ");
        Map<String, Integer> maps = new HashMap<>();

        while (currentLine != null) {
            for (String s : words) {
                if (maps.containsKey(s)) {
                    maps.put(s, maps.getOrDefault(s, 0) + 1);
                }
            }
            currentLine = bufferedReader.readLine();
        }

        Set<Map.Entry<String, Integer>> es = maps.entrySet();
        for (Map.Entry<String, Integer> s : es) {
            if (s.getValue() > 1) {
                System.out.println(s.getKey() + " -> " + s.getValue());
            }
        }
    }

    public static void sumArrayElements(int[] array) {
        int sum = 0;

        for (Integer s : array) {
            sum += s;
        }
        System.out.println("The Sum Of The " + array.toString() + " Is:" + sum);
    }

    public static void reverseArray(int[] array, int number) {
        int[] new_array = new int[number];
        int temp = number;

        for (int i = 0; i < number; i++) {
            new_array[temp - 1] = array[i];
            temp--;
        }

        for (int i = 0; i < number; i++) {
            System.out.print(new_array[i] + " ");
        }
    }

    public static void insertEvenIntoNewArray(int[] array, int number) {
        int[] new_array = new int[number];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                new_array[i] = array[i];
            }
        }

        for (int i = 0; i < new_array.length; i++) {
            System.out.println(new_array[i]);
        }
    }

    public static void showDuplicatesElementsArraySet(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int s : array) {
            frequencyMap.put(s, frequencyMap.getOrDefault(s, 0) + 1);
        }

        Set<Integer> key = frequencyMap.keySet();

        for (Integer s : key) {
            if (frequencyMap.get(s) > 1) {
                System.out.println();
            }
        }
    }

    public static void evenIntoNewArray(int[] array, int numb) {
        int[] new_array = new int[numb];
        int j = 0;


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                new_array[j++] = array[i];
            }
        }

        for (int s : new_array) {
            System.out.print(s + " ");
        }
    }

    public static void evenAndOddNumbersArray(int[] array, int size) {
        int[] evenArray = new int[size];
        int[] oddArray = new int[size];
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArray[evenCount++] = array[i];
            } else {
                oddArray[oddCount++] = array[i];
            }
        }

        System.out.print("Even elements: ");
        for (int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i] + " ");
        }

        System.out.print("\nOdd elements: ");
        for (int i = 0; i < oddArray.length; i++) {
            System.out.print(oddArray[i] + " ");
        }
    }

    public static void countNumberInNumberMap(int numb) {
        if (String.valueOf(numb).length() == 1) {
            System.out.println(numb + " -> " + 1);
        }

        Map<Integer, Integer> freq = new HashMap<>();
        while (numb != 0) {
            int last = numb % 10;

            freq.put(last, freq.getOrDefault(last, 0) + 1);
            numb /= 10;
        }

        Set<Map.Entry<Integer, Integer>> septa = freq.entrySet();

        for (Map.Entry<Integer, Integer> s : septa) {
            if (s.getValue() > 1) {
                System.out.println(s.getKey() + " -> " + s.getValue());
            }
        }
    }

    public static void summarizeDigitsInNumber(int numb) {
        int sum = 0;

        while (numb != 0) {
            sum += numb % 10;
            numb /= 10;
        }
        System.out.println(sum);
    }

    public static void countCharacter(String str) {
        Map<Character, Integer> chars = new HashMap<>();
        char[] arrayChars = str.toLowerCase().replaceAll("\\s", "").toCharArray();

        Arrays.sort(arrayChars);

        for (Character s : arrayChars) {
            chars.put(s, chars.getOrDefault(s, 0) + 1);
        }

        Set<Map.Entry<Character, Integer>> fts = chars.entrySet();
        for (Map.Entry<Character, Integer> s : fts) {
            if (s.getValue() > 1) {
                System.out.println(s.getKey() + " -> " + s.getValue());
            }
        }
    }

    public static void vowelCount(String ts) {
        int count = 0;

        for (char s : ts.toLowerCase().toCharArray()) {
            if (isVowel(s)) {
                count++;
            }
        }

//        for (int i = 0; i < ts.length(); i++) {
//            char s = ts.toLowerCase().charAt(i);
//            if (isVowel(s)) {
//                count++;
//            }
//        }
        System.out.println("Is: " + count);
    }

    public static void getCharPercentage(String str) {
        int countUpper = 0;
        int countLower = 0;
        int countDigit = 0;
        int countSpecial = 0;
        int len = str.length();

        for (int i = 0; i < len; i++) {
            char sc = str.charAt(i);

            if (Character.isDigit(sc)) {
                countDigit++;
            } else if (Character.isLowerCase(sc)) {
                countLower++;
            } else if (Character.isUpperCase(sc)) {
                countUpper++;
            } else {
                countSpecial++;
            }

        }


    }

    public static void reversedStringCharAt(String string) {
        String reversed = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reversed += string.charAt(i);
        }
        System.out.println("CharAt(i): " + reversed);
    }

    public static void reversedStringCharArray(String string) {
        System.out.println("To CharArray: ");
        for (int i = string.toCharArray().length - 1; i >= 0; i--) {
            System.out.print(string.toCharArray()[i]);
        }
    }

    public static String returnLastFourDigits(String string) {
        if (string.length() < 4) {
            return "Too Short";
        } else {
            return string.substring(string.length() - 4);
        }
    }

    public static void occurenceCharString(String str, char targ) {
        int count = 0;
        String vowels = "aeiou";
        for (char s : str.toCharArray()) {
            if (vowels.contains(String.valueOf(s))) {
                count++;
            }
        }
        System.out.println("The Count Shit is: " + count);
    }

    public static void countNumber(int number) {
        String rs = Integer.toString(Math.abs(number));
        System.out.println(rs.length());
    }

    public static int[] convertDigitToArray(int number) {
        String numberStr = Integer.toString(Math.abs(number));
        int[] digits = new int[numberStr.length()];

        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = numberStr.charAt(i) - '0';
        }
        return digits;
    }

    public static void revNumb(Integer st) {
        int result = 0;

        while (st != 0) {
            int reminder = st % 10;
            result = result * 10 + reminder;
            st /= 10;
        }
        System.out.println("Reversed: " + result);
    }

    public static void repetativeNumb(int number) {

        Map<Integer, Integer> maps = new HashMap<>();
        int last = number % 10;

        while (number != 0) {
            if (maps.containsKey(last)) {
                maps.put(last, maps.getOrDefault(last, 0) + 1);
            }
            number /= 10;
        }


        Set<Map.Entry<Integer, Integer>> entries = maps.entrySet();
        for (Map.Entry<Integer, Integer> s : entries) {
            if (s.getValue() > 1) {
                System.out.println(s.getKey() + " ---> " + s.getValue());
            }
        }
    }

    public static void countCharcaters(String str) {
        Map<Character, Integer> countCharacters = new HashMap<>();

        for (char s : str.toCharArray()) {
            if (Character.isLetterOrDigit(s)) {
                countCharacters.put(s, countCharacters.getOrDefault(s, 0) + 1);
            }
        }

        Set<Character> unique = countCharacters.keySet();
        for (Character s : unique) {
            if (countCharacters.get(s) > 1) {
                System.out.println(s + " ---> " + countCharacters.get(s));
            }
        }
    }

    public static void removeDuplicates(String ts) {
        String[] words = ts.replaceAll(".", "").toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        Set<String> unique = new HashSet<>();

        for (String s : words) {
            if (unique.add(s)) {
                sb.append(s).append(" ");
            }
        }
        System.out.println("RFS: " + sb.toString().toUpperCase());
    }

    public static void isPalindromString(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("The Reversed Is: " + reversed);

        if (str.toLowerCase().equals(reversed.toLowerCase())) {
            System.out.println("Yeah");
        } else {
            System.out.println("Nope");
        }
    }

    public static void countWordsFirstWay(String input) {
        Map<String, Integer> msps = new HashMap<>();
        String[] words = input.toLowerCase().split(" ");

        for (String s : words) {
            msps.put(s, msps.getOrDefault(s, 0) + 1);
        }

        Set<String> key = msps.keySet();
        for (String s : key) {
            if (msps.get(s) > 1) {
                System.out.println(s + " -> " + msps.get(s));
            }
        }
    }

    public static void temporaryMethod(int numb) {
        for (int i = 2; i < numb; i++) {
            boolean flag = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isVowel(char y) {
        y = Character.toLowerCase(y);
        return y == 'e' || y == 'o' || y == 'a' || y == 'i' || y == 'u';
    }

    public static void patternShit(String s) {
        String reg = "\\s";

        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println("Space found at index: " + matcher.start());
        }
    }

    //
    // *//

    //    Arrays:
    public static int linearSearchingArray(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void findMissingNumber(int[] array) {
        int leng = array.length + 1;
        int expected = leng * (leng + 1) / 2;
        int actual = 0;

        for (int s : array) {
            actual += s;
        }

        int miss = expected - actual;
        System.out.println(" Missed is: " + miss);
    }

    public static void showDuplicatesElementsArray(int[] array) {
        Set<Integer> store = new HashSet<>();
        System.out.println("Duplicate ");

        for (int s : array) {
            if (!store.add(s)) {
                System.out.print(s + " ");
            }
        }
        System.out.println();
    }

    public static void n_maxElement(int[] array, int n) {
        Arrays.sort(array);
        int max = array[array.length - n];
        System.out.println("The Number " + n + " Max " + max);
    }

    public static void averageArrayNumber(int[] array) {
        double avg = 0;
        int sum = 0;

        for (int s : array) {
            sum += s;
        }
        avg = sum / array.length;
        System.out.println("The Average Number From Array is: " + avg);
    }

    public static void joinString(String[] arr) {
        StringBuilder sb = new StringBuilder();

        System.out.println(String.join("", arr));
    }

    public static boolean arraysContains(int[] array, int target) {
        for (int s : array) {
            if (s == target) {
                System.out.println(" The Array Includes >>> " + target);
                return true;
            }
        }
        System.out.println(" The Array Does Not Include >>> " + target);
        return false;
    }

    public static void reversedNumberArray(int[] array, int n) {
        int[] new_array = new int[n];
        int j = n;

        for (int i = 0; i < n; i++) {
            new_array[j - 1] = array[i];
            j--;
        }

        for (int t = 0; t < n; t++) {
            System.out.println(new_array[t]);
        }
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

    //    Integer:
    public static void countNumberInteger(int number) {
        Map<Integer, Integer> maps = new HashMap<>();
        while (number != 0) {
            int last = number % 10;

            maps.put(last, maps.getOrDefault(last, 0) + 1);
            number = number / 10;
        }

        Set<Map.Entry<Integer, Integer>> sets = maps.entrySet();
        for (Map.Entry<Integer, Integer> s : sets) {
            if (s.getValue() > 1) {
                System.out.println(s.getKey() + " ---> " + s.getValue());
            }
        }
    }

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

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }

    public static void digitToArray(int number) {
        int count = (int) Math.log10(number) + 1;

        int[] digits = new int[count];

        int temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
    }

    public static String extractLastFourCharacters(String number) {
        if (number.length() < 4) {
            return "Input string is too short";
        }
        return number.substring(number.length() - 4);
    }

    public static void generateRandom(int num) {
        Random random = new Random();
        int randomNumber = random.nextInt(num) + 1;

        // Print the random number to the console
        System.out.println("Random Numbers is: " + randomNumber);
    }

    public static void printPrimes(int limit) {
        for (int i = 2; i < limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void isPrimeBoolean(int number) {
        boolean flag = false;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("'" + number + "' Is Prime Number. ");
        } else {
            System.out.println("'" + number + "' Is Not Prime Number. ");
        }
    }

    public static void factorialNumbers(int number) {
        int fact = 1;

        if (number == 0) {
            System.out.println("The Returned Number Is: " + 1);
        }

        for (int i = 0; i <= number; i++) {
            fact += i;
        }
        System.out.println("The Factorial Is: " + fact);
    }

    public static void reversedNumber(int number) {
        int res = 0;

        while (number != 0) {
            res = res * 10 + number % 10;
            number /= 10;
        }
        System.out.println("Reversed Number Is: " + res);
    }

    public static void summarizeDigitInNumber(int numb) {
        int sum = 0;

        while (numb != 0) {
            sum += numb % 10;
            numb /= 10;
        }
        System.out.println(" >>>> IS: " + sum);
    }

    public static int recursionAddNumber(int number) {
        if (number != 0) {
            return number + recursionAddNumber(number - 1);
        } else {
            return number;
        }
    }

    public static void repetative(Integer[] array) {
        List<Integer> list = Arrays.asList(array);
        Set<Integer> set = new HashSet<>(list);

        int count = 0;
        for (Integer s : set) {
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

    public static long factoralNumber(int number) {
        long fact = 1;
        if (number == 0) {
            return 1;
        }
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void fibonachi(int number) {
        int s1 = 0;
        int s2 = 1;
        int sum;

        for (int i = 1; i < number; i++) {
            sum = s1 + s2;
            System.out.println(s1);

            s1 = s2;
            s2 = sum;
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int limit) {
        for (int i = 2; i < limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
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

    public static void loop(int number) {
        int y = 0;
        while (y <= number) {
            System.out.println(y);
            y++;
        }
        System.out.println("DONE!!!");
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
            System.out.println(number + " --->>> " + 1);
        }

        Map<Integer, Integer> frequentMap = new HashMap<>();
        while (number != 0) {
            int lastNumber = number % 10;
            frequentMap.put(lastNumber, frequentMap.getOrDefault(lastNumber, 0) + 1);
            number /= 10;
        }

        Set<Integer> set = frequentMap.keySet();
        for (Integer s : set) {
            if (frequentMap.get(s) > 1) {
                System.out.println(s + " --->>> " + frequentMap.get(s));
            }
        }
    }

    public static void countDigitsInteger(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.println("The Numbers Of Digits is: " + count);
    }

    public static void leapYear() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Type The Number: ");
        int year = sc.nextInt();

        boolean a = (year % 4 == 0);
        boolean b = (year % 100 != 0);
        boolean c = (year % 100 == 0) && (year % 400 == 0);

        if (a & (b || c)) {
            System.out.println("Leap");
        } else {
            System.out.println("Nope");
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

    public static void isArm(int number) {
        int origin = number;
        double cub = 0;

        while (number != 0) {
            int reminder = number % 10;
            cub = Math.pow(reminder, 3);
            number /= 10;
        }

        if (cub == origin) {
            System.out.println("The " + cub + " is Armstrong!!!");
        } else {
            System.out.println("The " + cub + " is Not Armstrong!!!");
        }
    }

    public static void isPalindromeNumber(int num) {
        int result = 0;
        int reminder;
        int origin = num;

        while (num != 0) {
            reminder = num % 10;
            result = result * 10 + reminder;
            num /= 10;
        }
        if (result == origin) {
            System.out.println("Yep");
        } else {
            System.out.println("Nope");
        }
    }

    public static void reverseNumber(int number) {
        int reminder;
        int result = 0;

        while (number != 0) {
            reminder = number % 10;
            result = result * 10 + reminder;
            number /= 10;
        }
        System.out.println("Reversed Number is: " + result);
    }

    public static void summarizeRecursion(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println(" >>> --: " + sum);
    }

    public static int factorialRecursion(int num) {
        int fact = 1;
        if (fact == 0) {
            return 1;
        }

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void generatePassword(Integer length, String chars) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            Integer randomIndex = random.nextInt(chars.length());
            stringBuilder.append(chars.charAt(randomIndex));
        }
        System.out.println("Generated Password: " + stringBuilder.toString());
    }


    //    String:
    public static boolean isAnagramString(String w1, String w2) {
        if (w1.length() != w2.length()) {
            return false;
        }

        w1 = w1.toLowerCase().replaceAll("\\s", "");
        w2 = w2.toLowerCase().replaceAll("\\s", "");

        char[] wrd1 = w1.toCharArray();
        char[] wrd2 = w2.toCharArray();

        Arrays.sort(wrd1);
        Arrays.sort(wrd2);

        for (int i = 0; i < wrd1.length; i++) {
            if (wrd1[i] != wrd2[i]) {
                return false;
            }
        }

        return Arrays.equals(wrd1, wrd2);
    }

    public static void longestStringWord(String str) {
        String longestElement = "";

        List<String> longestArray = new ArrayList<>();
        String[] words = str.split("\\s");

        for (String s : words) {
            if (s.length() >= longestElement.length()) {
                longestElement = s;
                longestArray.add(longestElement);
            }
        }
        System.out.println("The Longest Word In the Sentence is " + longestArray);
    }

    public static void isPalindromeString(String str) {
        String reversedString = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }

        System.out.println(str.toLowerCase().equals(reversedString.toLowerCase()));
    }

    public static void removeDuplicatesString(String input) {
        StringBuilder stringBuilder = new StringBuilder();

        Set<Character> unique = new HashSet<>();

        for (char s : input.toCharArray()) {
            if (unique.add(s)) {
                stringBuilder.append(s);
            }
        }
        System.out.println(stringBuilder.toString());
    }

    public static void reverseStringThru(String str) {
        String reversed = "";

        for (int i = str.toCharArray().length - 1; i >= 0; i--) {
            System.out.print(str.toCharArray()[i]);
        }

    }

    public static void reverseEachWordString(String input) {
        StringBuilder reversed = new StringBuilder();
        String[] splitInput = input.toLowerCase().split("\\s+");

        for (String s : splitInput) {
            StringBuilder temporaryString = new StringBuilder(s);
            temporaryString.reverse();
            reversed.append(temporaryString).append(" ");
        }

        System.out.println("Reversed is: " + reversed.toString());
    }

    public static void countWordFile(String path) throws IOException {
        Map<String, Integer> frequencyMap = new HashMap<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String currentLine = bufferedReader.readLine();

        while (currentLine != null) {
            String[] words = currentLine.toLowerCase().split(" ");

            for (String s : words) {
                frequencyMap.put(s, frequencyMap.getOrDefault(s, 0) + 1);
            }
            currentLine = bufferedReader.readLine();
        }


        Set<String> set = frequencyMap.keySet();
        for (String s : set) {
            if (frequencyMap.get(s) > 1) {
                System.out.println(s + " ===>>> " + frequencyMap.get(s));
            }
        }
    }

    public static boolean anagramString(String w1, String w2) {
        if (w1.length() != w2.length()) {
            return false;
        }

        w1 = w1.toLowerCase().replaceAll(" ", "");
        w2 = w2.toLowerCase().replaceAll(" ", "");

        char[] w_1 = w1.toCharArray();
        char[] w_2 = w2.toCharArray();

        Arrays.sort(w_1);
        Arrays.sort(w_2);

        for (int i = 0; i < w_1.length; i++) {
            if (w_1[i] != w_2[i]) {
                return false;
            }
        }
        return Arrays.equals(w_1, w_2);
    }

    public static void countWord(String string) {
        String removedWhiteSpace = string.toLowerCase();
        String[] words = removedWhiteSpace.split("\\s");
        Arrays.sort(words);

        Map<String, Integer> maps = new HashMap<>();
        for (String s : words) {
            if (maps.containsKey(s)) {
                maps.put(s, maps.get(s) + 1);
            } else {
                maps.put(s, 1);
            }
        }
        Set<String> set = maps.keySet();
        for (String s : set) {
            if (maps.get(s) > 1) {
                System.out.println(s + " -> " + maps.get(s));
            }
        }
    }

    public static void generateRandomNumber(int number) {
        Random rd = new Random();
        int random = rd.nextInt(number) + 1;
        System.out.println("R is: " + random);
    }

    public static void longestWord(String str) {
        String longest = "";
        List<String> longesrArray = new ArrayList<>();
        String[] string = str.split("\\s");

        for (String s : string) {
            if (s.length() >= longest.length()) {
                longest = s;
                longesrArray.add(longest);
            }
        }
        System.out.println("The Longest Word In the Sentence is: " + longesrArray.toString());
    }

    public static boolean palindromeString(String string) {
        String rev = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            rev += string.charAt(i);
        }
        return (rev.toLowerCase().equals(string.toLowerCase()));
    }

    public static void capitalizeWords(String str) {
        String result = "";
        String[] words = str.split("\\s+");

        for (String s : words) {
            String rest = s.toLowerCase().substring(0, 1).toUpperCase() + s.substring(1);
            result += rest + " ";
        }
        System.out.print("The Shit Upper Shit Is: " + result);
    }

    public static void reverseChar(String string) {
        char[] chars = string.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }

    // Characters:
    public static void getCharacterOccurrence(String str, char arg) {
        int count = 0;

        for (char z : str.toLowerCase().toCharArray()) {
            if (z == arg) {
                count++;
            }
        }
        System.out.println(" >>> The " + arg + ": " + count + " <<< ");
    }

    public static void countDuplicatedCharacters(String str) {
        Map<Character, Integer> frequentMap = new HashMap<>();
        char[] chars = str.replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(chars);

        for (char s : chars) {
            frequentMap.put(s, frequentMap.getOrDefault(s, 0) + 1);
        }

        Set<Map.Entry<Character, Integer>> entries = frequentMap.entrySet();
        for (Map.Entry<Character, Integer> s : entries) {
            if (s.getValue() > 1) {
                System.out.println(s.getKey() + " ---> " + s.getValue());
            }
        }
    }
}

