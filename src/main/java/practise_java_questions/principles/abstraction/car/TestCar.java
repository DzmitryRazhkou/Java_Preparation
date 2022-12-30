package practise_java_questions.principles.abstraction.car;

public class TestCar {
    public static void main(String[] args) {
        Car v = new Tesla();
        v.start();
        v.refuel();

        MustangE me = new MustangE();
        me.refuel();
        me.refuel();
    }
}
