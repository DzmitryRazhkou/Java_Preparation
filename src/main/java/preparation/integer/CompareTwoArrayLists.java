package preparation.integer;

import java.util.ArrayList;
import java.util.List;

public class CompareTwoArrayLists {
    public static void main(String[] args) {

        ArrayList<String> Stringslist1= new ArrayList<String>();
        Stringslist1.add("Audi");
        Stringslist1.add("BMW");
        Stringslist1.add("Bugatti");
        Stringslist1.add("Ford");
        Stringslist1.add("Honda");
        Stringslist1.add("Hyundai");

        ArrayList<String> Stringslist2= new ArrayList<String>();
        Stringslist2.add("Audi");
        Stringslist2.add("BMW");
        Stringslist2.add("Bugatti");
        Stringslist2.add("Ford");

        List<String> f = new ArrayList<>();
        boolean h = Stringslist1.equals(Stringslist2);
        System.out.println(h);
    }
}
