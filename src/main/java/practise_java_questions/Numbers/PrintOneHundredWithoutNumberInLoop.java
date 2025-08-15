package practise_java_questions.Numbers;

public class PrintOneHundredWithoutNumberInLoop {
    public static void main(String[] args) {
        int one = 'a'/'a';
        String s1 = "//////////";

        for (int i = one; i<=(s1.length()*s1.length()); i++){
            System.out.println(i);
        }
//        a-97 b 98 c 99 d 100
        for (int i = one; i <='d'; i++ ){
            System.out.println(i);
        }
    }
}
