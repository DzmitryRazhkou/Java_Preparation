package practise_java_questions;

public class Remainder {
        public static void main(String[] args) {
            int res = remainder_1(100, 30);
            System.out.println(res);
            res = remainder_2(100,30);
            System.out.println(res);

        }

        private static int remainder_2(int a, int b) {
//        int x = a/b;
            return a-(a/b)*b;
        }

        private static int remainder_1(int a, int b) {
            while (a > b) {
                a = a - b;
            }
            return a;
        }
    }
