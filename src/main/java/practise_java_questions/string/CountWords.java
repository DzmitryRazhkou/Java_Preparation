package practise_java_questions.string;

import java.util.HashMap;

public class CountWords {
    public static void main(String[] args) {
        String str = "This this is is IS Done done by done by Me";
        String lstr = str.toLowerCase();
        String[] split = lstr.split(" ");

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < split.length; i++) {
            if (map.containsKey(split[i])) {
                int count = map.get(split[i]);
                map.put(split[i], count+1);
            } else {
                map.put(split[i], 1);
            }
        }
        System.out.println(map);

    }
}
