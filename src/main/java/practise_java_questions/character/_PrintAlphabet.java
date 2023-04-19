package practise_java_questions.character;

public class _PrintAlphabet {
    public static void main(String[] args) {
        printAlphabetIndexChars("capital");
        printAlphabetChars();

    }

    public static void printAlphabetChars() {
        System.out.println("Alphabet With Using Characters");
        for (char c = 'a'; c < 'z'; c++) {
            System.out.print(c + " ");
        }
    }

    public static void printAlphabetIndexChars(String flag) {
        System.out.println("Alphabet With Using Characters");
        if (String.valueOf(flag).equalsIgnoreCase("capital")) {
            for (char c = 65; c < 90; c++) {
                System.out.print(c + " ");
            }
        } else {
            for (char c = 97; c < 122; c++) {
                System.out.print(c + " ");
            }
        }
    }
}
