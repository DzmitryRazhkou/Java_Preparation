package practise_java_questions.principles.constructor;

public class EV extends Car{
    protected String battery;

    public EV(String make, String model, Integer year, String battery) {
        super(make, model, year);
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }
}
