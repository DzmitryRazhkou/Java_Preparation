package practise_java_questions.string;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "Lol";
        String rev = "";
        int s = str.length() - 1;

        for (int i = s; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.toLowerCase().equals(rev.toLowerCase())){
            System.out.println("y");
        } else {
            System.out.println("n");
        }
    }
}
