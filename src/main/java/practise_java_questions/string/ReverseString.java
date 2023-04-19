package practise_java_questions.string;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Levic Meow";
        char js[] = str.toCharArray();
        int length = js.length;
        System.out.println("String Length is: " + length);
        for (int i = js.length - 1; i >= 0; i--) {
            System.out.print(js[i]);
        }

//        Method 2

        System.out.println("\n-----------");
        String reverseWord = "";
        for (int i = length - 1; i >= 0; i--) {
            reverseWord = reverseWord + str.charAt(i);
        }
        System.out.println(reverseWord);
        System.out.println("\n-----------");

//        Method 3

        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.reverse());
    }
}

