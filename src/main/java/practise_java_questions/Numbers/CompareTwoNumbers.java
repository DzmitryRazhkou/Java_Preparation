package practise_java_questions.Numbers;

public class CompareTwoNumbers {
    public static void main(String[] args) {

//        **
//        Compare two int numbers (Integer Caching)
//        **

//      -128 ... 127 Caching range

        Integer n1 = 128;
        Integer n2 = 128;

        if(n1 == n2) {
            System.out.println("Both are equal");
        } else {
            System.out.println("Both are not equal");
        }
    }
}
