package temp;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        System.out.println(comp("Ler", "Lev"));
        String[]s = {"Java", "Java", "Python", "C++"};

        System.out.println(dup(s));

        int n = 75;
        for (int i = 1; i<=n; i++){
            if (n%i==0){
                System.out.println(i);
            }
        }

        int num = 9;
        int t1 = 0;
        int t2 = 1;

        for (int i = 1; i<=num; i++){
            System.out.println(t1);
            int sum = t1+t2;
            t1=t2;
            t2=sum;
        }


    }








    public static boolean comp(String s1, String s2) {
        if (s1 == null || s2 == null)
            return false;
        if (s1.length() != s1.length())
            return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean dup(String[] str){
        Set<String> set = new HashSet<>();
        for (String s: str){
            if(set.add(s) == false){
                System.out.println("Duplicate: " +s);
            }
        }
        return false;
    }


}
