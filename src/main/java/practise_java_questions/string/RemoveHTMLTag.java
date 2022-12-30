package practise_java_questions.string;

public class RemoveHTMLTag {
    public static void main(String[] args) {
        String txt = "<p> I don't want this p tag<p>";
        System.out.println(txt);
        txt = txt.replaceAll("\\<.*?\\>", "").trim();
        System.out.println(txt);
    }
}
