package practise_java_questions.brake_continue;

public class Break_ContinueConcept {
    public static void main(String[] args) {

//      //  The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
//        This example skips the value of 4:

        for (int i = 0; i <= 10; i++) {
            if (i == 4) {   // avoid 4.
                continue;
            }
            System.out.println(i);
        }
        System.out.println("________");

        int i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("________");

        int j = 0;
        while (j < 10) {
            System.out.println(j);
            j++;
            if (j == 4) {
                break;   // Will Stop in 4.
            }
        }
        System.out.println("Done...");
    }
}
