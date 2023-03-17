package practise_java_questions.character;

public class Character_Alphabet_Not {
    public static void main(String[] args) {
        char z = '1';
        isAlphabet(z);
    }
    public static void isAlphabet(char y) {
        if ((y >= 'a' && y <= 'z') || (y >= 'A' && y <= 'Z')) {
            System.out.println(y + " is Related to Alphabet");
        } else {
            System.out.println(y + " is not Related to Alphabet");
        }
    }
}
