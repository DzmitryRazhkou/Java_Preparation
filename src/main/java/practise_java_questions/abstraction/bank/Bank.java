package practise_java_questions.abstraction.bank;

public abstract class Bank {
    public abstract void loan();   //Abstract Method - No method body

//    partial abstraction
//    Hiding the implementation logic - is called Abstraction (OOP Concept)
//    Abs class can have Abs methods and Non-abs methods
//    Can not create the object of Abs method

    int bank = 10;
    final int rate = 10;
    static int loanRate = 5;

    public void credit(){
        System.out.println("Bank - Credit");
    }

    public void debit(){
        System.out.println("Bank - Debit");
    }

}
