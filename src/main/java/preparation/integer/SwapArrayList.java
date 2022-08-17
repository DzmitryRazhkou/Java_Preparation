package preparation.integer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SwapArrayList {
    public static void main(String[] args) {
        List<String> v = new ArrayList<>(Arrays.asList("Honda", "Toyota", "Chevy", "GMC", "Cadillac", "Infinity", "Mini"));
        Collections.swap(v, 0, 4);
        System.out.println(v);
    }
}
