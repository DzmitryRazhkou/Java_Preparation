package practise_java_questions.arrays;

import java.util.HashSet;
import java.util.Set;

public class ShowDuplicatesElementsArray {
    public static void main(String[] args) {
        String[] names = {"Javascript", "Java", "C++", "C#", "Java"};
        Set<String> store = new HashSet<>();
        for (String j : names) {
            if (!store.add(j)){
                System.out.println("Duplicate: " + j);
            }
        }
    }
}
