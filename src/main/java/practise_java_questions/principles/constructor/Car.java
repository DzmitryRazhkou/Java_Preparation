package practise_java_questions.principles.constructor;

public class Car {
    protected String make;
    protected String model;
    protected Integer year;

    public Car(String make, String model, Integer year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public String getFullName(){
        return "Vehicle = " +this.make+ " " +this.model+ " " +this.year;
    }

    public String getMake() {

        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
