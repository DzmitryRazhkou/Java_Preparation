package preparation.integer;

import java.util.ArrayList;

public class IncreaseSizeOfArrayList {
    public static void main(String[] args) {
        ArrayList<String> Stringslist= new ArrayList<String>(3);
        Stringslist.add("Audi");
        Stringslist.add("BMW");
        Stringslist.add("Bugatti");

        Stringslist.ensureCapacity(10);

    }
}
