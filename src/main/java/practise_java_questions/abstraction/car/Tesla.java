package practise_java_questions.abstraction.car;

public class Tesla implements Car {
    @Override
    public void start() {
        System.out.println("Start");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void refuel() {
        System.out.println("Charge");
    }
}
