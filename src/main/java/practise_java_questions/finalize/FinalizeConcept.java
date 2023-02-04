package practise_java_questions.finalize;

public class FinalizeConcept {
    public static void main(String[] args) {
        FinalizeConcept obj = new FinalizeConcept();
        obj = null;

        System.gc();
        System.out.println("Bye...");
    }

    @Override
    public void finalize(){
        System.out.println("Inside the finalize method");
    }

//    Object is created, and obj will declare as null,
//    then finalize method would be called without obj.finalize by garbage collector.
//    then System.gc and obj will be erased.

}
