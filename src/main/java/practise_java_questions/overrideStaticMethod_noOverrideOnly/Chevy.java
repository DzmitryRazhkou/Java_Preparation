package practise_java_questions.overrideStaticMethod_noOverrideOnly;

public class Chevy extends Car {

    public void start(){
        System.out.println("Chevy --- start");
    }

    public static void charge(){
        System.out.println("Chevy --- charge");
    }
}
