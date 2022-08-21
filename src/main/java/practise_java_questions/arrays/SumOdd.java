package practise_java_questions.arrays;

public class SumOdd {
    public static void main(String[] args) {
        int number = 7;
        int sum = 0;
            for (int i = 0; i < number; i++){
                if (i%2 != 0){
                    sum = sum + i;
                }
            }
        System.out.println(sum);

        }
    }

