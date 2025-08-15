package practise_java_questions.tricky;

public class concat_equal {
    public static void main(String[] args) {

    String s1 = "gans";
    String s2 = "selenium";

//    s1.concat(s2);   // "gans // s1 related to s1 still

        s1 = s1.concat(s2);
        System.out.println(s1);

        System.out.println(s1 == s2);  // true
        System.out.println(s1.equals(s2));  // true

//        In heap store the value - gans ,but the different name in the stack.


//        BUT!!!:

        String f1 = new String("gans");
        String f2 = new String("gans");
        System.out.println(s1.equals(s2));  // false

        System.out.println(f1.equals(f2));  // false

//        In heap store the two different value - gans ,but the different name in the stack.



}}
