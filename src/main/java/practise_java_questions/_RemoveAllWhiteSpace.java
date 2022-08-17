package practise_java_questions;


public class _RemoveAllWhiteSpace {
    public static void main(String[] args) {

        String newString = "  What I got to do    with that?  ";

//      1. replaceAll()

        System.out.println("replaceAll Method: "+newString.replaceAll("\\s+", ""));   // It works without \\s+ ("+")
        System.out.println("________");

//       2. StringUtils:

//        String remStr = StringUtils.deleteWhitespace(newString);
//        System.out.println("With using StringUtils: "+remStr);
//        System.out.println("-------");

//       3. split("\\s") and StringBuffer

        String newArr[] = newString.split("\\s");
        StringBuffer remString = new StringBuffer();
        for (String y: newArr) {
            remString.append(y);
        }
        System.out.println("StingBuffer: " +remString);


    }
}
