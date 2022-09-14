package practise_java_questions.star_paterrns;

public class Star_Pattern1 {
    public static void main(String[] args) {

        for (int i = 0; i <= 4; i++){
            for (int j = i; j >= 0; j--){
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
}
