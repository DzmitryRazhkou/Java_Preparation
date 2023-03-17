package practise_java_questions.string;

public class RegExp {
    public static void main(String[] args) {
        String removeAllLines = "Your cruel device\n" +
                "Your blood, like ice\n" +
                "One look, could kill\n" +
                "My pain, your thrill";
        String chineseSymbols = "汉字/漢字 Selenium Grid Amazon E2C'";
        String input = "Text  With     Whitespaces ";

        removeAllLines(removeAllLines);
        removeJunkSymbols(chineseSymbols);
        removeSymbols(chineseSymbols);
        removeWhiteSpace(input);
    }

    public static void removeAllLines(String str) {
        str = str.replaceAll("[\\r\\n]", " "); // we can use [\\n] or [\n], [\r] or [\\r], [\\r\\n]
        System.out.println(str);
    }

    public static void removeJunkSymbols(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", " ").trim(); // ^ - means remove all not includes a-zA-Z0-9

        System.out.println(str);
    }

    public static void removeSymbols(String str) {
        str = str.replaceAll("[a-zA-Z0-9]", " ").trim(); // ^ - means remove all not includes a-zA-Z0-9
        str = str.replace("'", "");
        System.out.println(str);
    }

    public static void removeWhiteSpace(String str) {
        str = str.replaceAll("\\s+", " ");
        System.out.println(str);
    }

}

// 1	[abc]	a, b, or c (simple class)
// 2	[^abc]	Any character except a, b, or c (negation)
// 3	[a-zA-Z]	a through z or A through Z, inclusive (range)
// 4	[a-d[m-p]]	a through d, or m through p: [a-dm-p] (union)
// 5	[a-z&&[def]]	d, e, or f (intersection)
// 6	[a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)
//        \d	Any digits, short of [0-9]
//        \D	Any non-digit, short for [^0-9]
//        \s	Any whitespace character, short for [\t\n\x0B\f\r]
//        \S	Any non-whitespace character, short for [^\s]
//        \w	Any word character, short for [a-zA-Z_0-9]
//        \W	Any non-word character, short for [^\w]
