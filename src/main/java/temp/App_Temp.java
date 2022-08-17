package temp;

public class App_Temp {
    public static void main(String[] args) {

        System.out.println(S(13));
    }

    public static boolean S(int n){
        boolean f = false;
        for (int i = 2; i < n/2; i++){
            if (n%i==0){
                f = true;
                break;
            }
        }
            if (!f){
                return true;
            } else {
                return false;
            }
        }
    }


