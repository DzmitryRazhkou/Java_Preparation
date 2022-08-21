package practise_java_questions.principles.overrideStaticMethod_noOverrideOnly;

public class Car {

    public void start() {
        System.out.println("Car --- start");
    }

    public void stop() {
        System.out.println("Car --- stop");
    }

    public void refuel() {
        System.out.println("Car --- refuel");
    }

    public static void charge() {
        System.out.println("Chevy --- charge");
    }
}
