package preparation.integer;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArrayElement {
    public static void main(String[] args) {
        String[]words = {"Lev", "Leo", "Leo", "Kot"};
        Set<String> set = new HashSet<>();
        for (String f: words){
            if (set.add(f) == false){
                System.out.println(f);
            }
        }
    }
}
