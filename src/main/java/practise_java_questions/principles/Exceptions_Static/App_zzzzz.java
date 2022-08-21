package practise_java_questions.principles.Exceptions_Static;

public class App_zzzzz {
    public static void main(String[] args) {
        Person_Both anna = new Person_Both("Anna");
        Person_Both sam = new Person_Both("Sam");

        anna.setXx("Zzzzzz");
        System.out.println(sam.getXx());

//        Static field is created just one for static

//        Static ----> class
//        Non-static ----> object.

    }
}
