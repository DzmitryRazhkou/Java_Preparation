package practise_java_questions.character;

public class _Vowel_Consonant {
    public static void main(String[] args) {
//        a, e, i, o, u
        String s = "Java java c++ C++ JS Js";
        String vowelsCountChars = "Hey you";
        containsVowelsCharsFirstMethod('p');
        containsVowelsCharsSecondMethod('p');
        vowelsString(s);
        containCharsThruMatches(s);
        countVowelsString(vowelsCountChars);
    }

    public static void vowelsString(String str) {
        boolean containsVowels = false;

        for (char s : str.toCharArray()) {
            if (isVowel(s)) {
                containsVowels = true;
                break;
            }
        }
        if (containsVowels) {
            System.out.println("Yes");
        } else {
            System.out.println("Nope");
        }
    }

    public static boolean isVowel(char y) {
        return y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u';
    }

    public static void containsVowelsCharsFirstMethod(char y) {
        if (y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u') {
            System.out.println("First Methods -> '" + y + "' is Vowels Characters. ");
        } else {
            System.out.println("First Methods -> '" + y + "' is Consonant Characters. ");
        }
    }

    public static void containsVowelsCharsSecondMethod(char y) {
        switch (y) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(y + " <= Second Method - Vowels. ");
                break;

            default:
                System.out.println(y + " <= Second Method - Consonants. ");
        }
    }

    public static void containCharsThruMatches(String str) {
        boolean result = str.matches(".*[aeuio].*");
        System.out.println(result);
    }

    public static void countVowelsString(String str) {
        str = str.toLowerCase();
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            char y = str.charAt(i);
            if (y == 'a' || y == 'e' || y == 'u' || y == 'o' || y == 'i') {
                counter++;
            }
        }
        System.out.println("The Amount of Vowels Chars is: " + counter);
    }

}
