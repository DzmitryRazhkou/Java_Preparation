package practise_java_questions.inferface;

public interface USMedical {

    int min_fee = 25;

//    Interface can not have method body
//    Only method prototype
//    Only method declaration
//    Can not create the object of interface
//    All the vars in interface are static and final by default

    public void orthoServices();
    public void physioServices();
    public void cardioServices();

//    1. We can have static method in interface

    public static void totalDocs(){
        System.out.println("Total Doctors");
    }

//    2. Can have default method

    public default void billing(){
        System.out.println("US - Billing");
    }



}
