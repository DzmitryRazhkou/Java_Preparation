package practise_java_questions.character;

public class Character_Alphabet_Not {
    public static void main(String[] args) {

        char z = '1';

        if ((z>='a' && z<='z') || (z>='A' && z<='Z')) {
            System.out.println(z +" - an alphbet");
        }
        else {
            System.out.println(z +" - not an alphbet");
        }
    }
}
