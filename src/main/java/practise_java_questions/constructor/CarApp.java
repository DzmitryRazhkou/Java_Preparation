package practise_java_questions.constructor;

public class CarApp {
    public static void main(String[] args) {
        Car v = new Car("Cadi", "Escalade", 2019);
        System.out.println(v.getFullName());
        System.out.println("______");

        v.year = 2020;
        v.make = "Cadillac";
        System.out.println(v.getFullName());

    }

}
