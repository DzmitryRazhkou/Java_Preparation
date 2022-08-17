package preparation.integer;

public class RemoveHTMLTag {
    public static void main(String[] args) {
        String txt = "<p> I don't want this p tag<\\p>";
        System.out.println(txt);
        txt = txt.replaceAll("\\<.*?\\>", "").trim();
        System.out.println(txt);
    }
}
