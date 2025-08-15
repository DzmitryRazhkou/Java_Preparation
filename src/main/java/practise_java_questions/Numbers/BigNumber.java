package practise_java_questions.Numbers;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumber {
    public static void main(String[] args) {
        BigInteger n1 = new BigInteger("6732335567899589563453640975450099754389077789945323333333333");
        BigInteger n2 = new BigInteger("6732335567899589563453640975450099754389077789945323333333333");

        BigInteger sum = n1.add(n2);
        System.out.println(sum);

        BigDecimal d1 = new BigDecimal("4536745654897656456789087654567898765678.0987654567890987");
        BigDecimal d2 = new BigDecimal("9876586543675866543467585653647586856.87678767656765");

        BigDecimal div = d1.subtract(d2);
        System.out.println(div);
    }

}
