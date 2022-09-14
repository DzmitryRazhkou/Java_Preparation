package practise_java_questions.loops.brake_continue;

public class Loops {
    public static void main(String[] args) {
        for (int i=0; i<=10; i++){
            System.out.println(i);
        }
        System.out.println("________");


        int t=2;
        while (t<12){
            System.out.println(t);
            t++;
        }
        System.out.println("________");


        for (int x=0; x<10; x++){
            if(x>5){
                break;
            }
            System.out.println(x);
        }
        System.out.println("Loop is stopped");



        for (int y=0; y<10; y++){
            if(y==5){
                continue;
            }
            System.out.println(y);
        }



        for (int c=0; c<6; c++){
            int f=0;
            while (f<3){
                System.out.println(c);
                f++;
            }
        }
    }

}
