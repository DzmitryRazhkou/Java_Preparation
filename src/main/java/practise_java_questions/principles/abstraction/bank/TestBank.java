package practise_java_questions.principles.abstraction.bank;

public class TestBank {
    public static void main(String[] args) {
        WellsFargo wf = new WellsFargo();
        wf.credit();
        wf.debit();
        wf.loan();

        System.out.println("________");

        Bank b = new WellsFargo();
        b.credit();
        b.debit();
        b.loan();
        int y = Bank.loanRate;

        CapitalOne t = new CapitalOne();
        t.loan();
        System.out.println("Loan Rate is: "+y);
    }
}
