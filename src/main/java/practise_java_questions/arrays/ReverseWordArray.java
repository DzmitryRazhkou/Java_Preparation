package practise_java_questions.arrays;

public class ReverseWordArray {
    public static void main(String[] args) {
        String str = "Hey Gans Selenium";
        String[] arr = str.split(" ");
        String rev = "";

        for(String w: arr){
            String reverseWord = "";
            for (int i = w.length() - 1; i>=0; i--){
                reverseWord = reverseWord + w.charAt(i);
            }
            rev = rev + reverseWord+ " ";
        }
        System.out.println(rev);

    }
}
