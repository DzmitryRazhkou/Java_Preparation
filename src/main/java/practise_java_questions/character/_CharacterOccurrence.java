package practise_java_questions.character;

public class _CharacterOccurrence {
    public static void main(String[] args) {
        getCharacterOccurrence("Leo Weow", 'e');
    }

    public static void getCharacterOccurrence(String str, char value) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == value)
                count++;
        }
        System.out.println(value + ":" + count);
    }
}
