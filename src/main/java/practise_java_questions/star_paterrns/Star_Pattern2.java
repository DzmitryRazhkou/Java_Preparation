package practise_java_questions.star_paterrns;

public class Star_Pattern2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++){
            for (int j = 4; j >= i; j--){
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }

}
