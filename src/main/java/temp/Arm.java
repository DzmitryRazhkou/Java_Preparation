package temp;

public class Arm {
    public static void main(String[] args) {
        arm(153);

    }
    public static void arm(int num){
        int reminder;
        double cube = 0;
        int temp;

        temp = num;

        while (num>0) {
        reminder = num%10;
        cube = cube+ (Math.pow(reminder, 3));
        temp = num/10;
    }
        if (cube == num){
            System.out.println("Yes" +cube);
        }
        else {
            System.out.println("No");
        }
}}
