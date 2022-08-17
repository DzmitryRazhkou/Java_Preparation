package preparation.integer;

public class ReplaceAll {
    public static void main(String[] args) {
        String str = "TECHSTUDY - The Complete Debugging Solution";

        // Replace all the 'd' characters with 'f' characters.
        String new_str = str.replace('T', 'Y');

        // Display the strings for comparison.
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);
    }
}
