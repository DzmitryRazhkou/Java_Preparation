package temp;

public class Basic {
    public static void main(String[] args) {
        int h = 0;
        while (h<10){
            h++;
            System.out.println(h);
        }

        System.out.println("------");

        for (int i = 0; i < 5; i++) {
            int t = 0;
            while (t<2){
                System.out.println(t);
                t++;
            }
            continue;
        }
    }
}
