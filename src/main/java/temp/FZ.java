package temp;

import java.io.IOException;

public class FZ {
    public static void main(String[] args) throws IOException {
        String str = "Leo Levic Olly";
        char[] arr = str.toCharArray();
        int length = args.length - 1;
        for (int i = length; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

}




