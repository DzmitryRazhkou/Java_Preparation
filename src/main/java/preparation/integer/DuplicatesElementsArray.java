package preparation.integer;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesElementsArray {
    public static void main(String[] args) {
        String[] names = {"Javascript", "Java", "C++", "C#", "Java"};
        Set<String> store = new HashSet<String>();
        for (String j : names) {
            if (store.add(j) == false){
                System.out.println("Duplicate: " + j);
            }
        }
    }
}
