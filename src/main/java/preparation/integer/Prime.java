package preparation.integer;

public class Prime {
    public static void main(String[] args) {
        Prime(17);
    }
    public static void Prime(int numb){
        boolean flag = false;
        for (int i = 2; i < numb/2; i++) {
            if (numb%i == 0){
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.println("Prime");
        } else {
            System.out.println("No");
        }
    }
}
