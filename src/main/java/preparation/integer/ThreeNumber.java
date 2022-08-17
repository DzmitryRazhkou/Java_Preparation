package preparation.integer;

public class ThreeNumber {
    public static void main(String[] args) {
        int x = 200;
        int y = 400;
        int z = 700;

        if (x>y && x>z){
            System.out.println("X is the greater");
        } else if (y>z) {
            System.out.println("Y is the greater");
        } else {
            System.out.println("Z is the greater");
        }
    }
}
