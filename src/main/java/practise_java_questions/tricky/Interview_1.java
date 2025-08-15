package practise_java_questions.tricky;

public class Interview_1 {
    public static void main(String[] args) {
        int i, j, k, l = 0;
        k = l++;
        j = ++k;
        i = j++;
        System.out.println(i);

        System.out.println("/////////");
        sec();
    }

    public static void sec() {
        int i = 1;
        do {
            i--;
        } while (i > 2);
        System.out.println(i);
    }
}
