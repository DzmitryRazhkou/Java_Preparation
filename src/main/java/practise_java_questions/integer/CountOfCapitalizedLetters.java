package practise_java_questions.integer;

public class CountOfCapitalizedLetters {
    public static void main(String[] args) {

        String str = "NaveenMaryShitBettyo";

//        1.
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                count++;
            }
        }

        System.out.println(count);
        System.out.println("____________");

//        2.

        int count1 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                count1++;
            }
        }
        System.out.println(count1);
        System.out.println("____________");

        int count2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count2++;
            }
        }
        System.out.println(count2);
        System.out.println("____________");

//        4. streams:

        long count4 = str.chars().filter(e -> e >= 65 && e <= 90).count();
        System.out.println(count4);

        long count5 = str.chars().filter(r -> Character.isUpperCase(r)).count();
        System.out.println(count5);




    }
}
