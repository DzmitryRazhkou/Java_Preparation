package practise_java_questions.principles.abstraction.bank;

public class CapitalOne extends WellsFargo{
    public static void refinance(){
        System.out.println("Capital one finance");
    }

    @Override
    public void loan() {
        System.out.println("Capital One - Loan");
    }
}
