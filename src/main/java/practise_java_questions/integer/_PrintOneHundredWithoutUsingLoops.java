package practise_java_questions.integer;

public class _PrintOneHundredWithoutUsingLoops {
    public static void main(String[] args) {
        printNum(1);
        System.out.println("--------");
        printNumber(1, 100);
    }

    public static void printNum(int num) {
        if (num <= 100) {
            System.out.println(num);
            num++;

            printNum(num);

        }
    }

    public static void printNumber(int stNumb, int endNum) {
        if (stNumb <= endNum) {
            System.out.println(stNumb);
            stNumb++;
            printNumber(stNumb, endNum);
        }
    }
}
