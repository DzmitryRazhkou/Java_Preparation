package preparation.integer;

public class RemoveParticular {
    public static void main(String[] args) {
        String str = "TechStudy.org";
        System.out.println(removeCharAt(str, 5));
    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}

