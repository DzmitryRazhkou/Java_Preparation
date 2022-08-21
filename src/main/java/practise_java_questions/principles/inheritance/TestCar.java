package practise_java_questions.principles.inheritance;

public class TestCar {
    public static void main(String[] args) {

        Tesla t = new Tesla();
        t.start();   // inherited
        t.stop();   //inherited
        t.refuel();   //overridden
        t.autoPilot();   //Child class
        t.musicSystem("CD");
        System.out.println("___________");

        Car c = new Car();
        c.start();
        c.stop();
        c.refuel();
        System.out.println("___________");

//        Top casting:
        Car c1 = new Tesla();   // child class object can be referred by parent reference variable.
        c1.start();
        c1.stop();
        c1.refuel();

//        Down casting:
//        Tesla t1 = (Tesla) new Car();   //ClassCastException

    }
}
