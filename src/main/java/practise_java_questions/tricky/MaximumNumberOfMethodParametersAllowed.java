package practise_java_questions.tricky;

public class MaximumNumberOfMethodParametersAllowed {

    public void testing(int a, int b, int c){
//        int, short, byte, boolean, float, classtype -- 254 (non-static) and 255 (static)
//        double, long ---> 127 (static and non-static)

//        doduble ---> 8 bytes
//        int ---> 4 bytes

    }

    public static void main(String[] args) {
        MaximumNumberOfMethodParametersAllowed m1 = new MaximumNumberOfMethodParametersAllowed();
    }

}
