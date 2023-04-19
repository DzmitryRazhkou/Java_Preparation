package practise_java_questions.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapToArray {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Philadelphia", "PA");
        map.put("San Francisco", "CA");
        map.put("Jacksonville", "FL");
        map.put("Chicago", "IL");

        String[] keys = map.keySet().toArray(new String[map.size()]);
        String[] values = map.values().toArray(new String[map.size()]);

        Map.Entry<String, String>[] entries = map.entrySet().toArray(new Map.Entry[map.size()]);
    }
}
