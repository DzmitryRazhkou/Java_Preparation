package practise_java_questions.reversenumber_palindrone_armstrong;

public class _ArmstrongNumber {
    public static void main(String[] args) {

//    153
//    1*1*1 = 1
//    5*5*5 = 125
//    3*3*3 = 27
//    1+125+27 = 153

        isArmstrong(153);

    }

    public static void isArmstrong(int num) {
        int cube = 0;   // cube
        int reminder;   // reminder
        int temporary;   // temporally number

        temporary = num;

        while (num > 0) {
            reminder = num % 10;
            num = num / 10;
            cube = cube + (reminder * reminder * reminder);
        }

        if (cube == temporary) {
            System.out.println("This is armstrong number");
        } else {
            System.out.println("Oh No......");
        }
    }
}
