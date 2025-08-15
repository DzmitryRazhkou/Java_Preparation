package practise_java_questions.principles.overloadedMainMethod_yes;

public class Car {
    public void describe(String brand) {
        System.out.println("The car is a " + brand + ".");
    }

    // Method to describe a car with two parameters (brand and model)
    public void describe(String brand, String model) {
        System.out.println("The car is a " + brand + " " + model + ".");
    }

    // Method to describe a car with three parameters (brand, model, and year)
    public void describe(String brand, String model, int year) {
        System.out.println("The car is a " + year + " " + brand + " " + model + ".");
    }
}
