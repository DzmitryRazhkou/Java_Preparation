package practise_java_questions.Try_Catch;

public class FinallyBlock {
    public static void main(String[] args) {

        System.out.println("Car");
        try {
            int i = 9 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception is here...");
        } finally {
            System.out.println("Done...");
            System.out.println("____________________");
        }
        System.out.println(getMarks("Tom"));
    }

    public static int getMarks(String name) {
        if (name.equals("James")) {
            return 90;
        } else if (name.equals("Tom")) {
            try {
                int i = 9 / 0;
                return 45;
            } catch (Exception e) {
                return 50;

            } finally {
                System.out.println("Inside Finally Block");
            }
        } else if (name.equals("John")) {
            return 95;
        }
        return -1;
    }
}
