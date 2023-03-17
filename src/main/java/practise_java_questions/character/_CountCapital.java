package practise_java_questions.character;

public class _CountCapital {
    public static void main(String[] args) {
        String str = "Naveen Mary Shit Betty";
        countCapitalLetters(str);
    }

    public static void countCapitalLetters(String str) {
        if (str.length() == 0){
            System.out.println("Provide _");
        }
        char[] charArray = str.toCharArray();
        int counter = 0;

        for (int i = 0; i < charArray.length; i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                counter++;
            }
        }
        System.out.println("The Amount of the Capital Letters is: " + counter);
    }
}
