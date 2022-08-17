package practise_java_questions.tricky;

public class LongNumbers_SuffixWithoutL_WithL {

    public static void main(String[] args) {

        long longNumberWithoutL = 1000*60*60*24*365;
        long longNumberWithL = 1000*60*60*24*365L;

        System.out.println(longNumberWithoutL);
        System.out.println(longNumberWithL);   // 31536000000

//        31536000000 (36 bits) --->>> 11101010111101100010010110000000000 (binary)
//        Max limit of 32 bit int: 1010111101100010010110000000000 (removed 4 first digits)
//        --->>> 1010111101100010010110000000000 ---->>>> 1471228928 (decimal)

    }
}
