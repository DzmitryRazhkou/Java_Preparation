package practise_java_questions.character;

public class __Vowel_Consonant {
    public static void main(String[] args) {
//        a, e, i, o, u

        char ch = 'c';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " - is vowels");
        } else {
            System.out.println(ch + " - is consonant");
        }

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " - is vowels");
                break;

            default:
                System.out.println(ch + " - is consonant");
        }


    }
}
