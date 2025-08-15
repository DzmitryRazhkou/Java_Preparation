package practise_java_questions.principles.overloadedMainMethod_yes;

public class Test {
    public static void main(String[] args) {
        Car vehicle = new Car();

        vehicle.describe("Tesla");
        vehicle.describe("Tesla", "Y");
        vehicle.describe("Tesla", "Y", 2019);
    }
}
