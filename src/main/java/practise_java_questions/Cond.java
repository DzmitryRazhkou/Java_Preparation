package practise_java_questions;

public class Cond {
    public static void main(String[] args) {
        int time1 = 5;
        int time2 = 7;
        String s = (time1<time2) ? "Shit" : "Its ok";
        System.out.println(s);

        boolean allowed = true;
        if(allowed){
            System.out.println("L");
        } else {
            System.out.println("F");
        }

        int x = 12;
        int p = (x==10 ? 4 : 5);
        System.out.println(p);


    }
}
