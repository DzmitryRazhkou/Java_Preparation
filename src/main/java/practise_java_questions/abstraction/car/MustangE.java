package practise_java_questions.abstraction.car;

public class MustangE extends Tesla implements Car{
    @Override
    public void refuel(){
        System.out.println("Charge - Mustang");
    }

    public static void screen(){
        System.out.println("Mustang E-Mach");
    }

    @Override
    public void start() {
        super.start();
    }

}
