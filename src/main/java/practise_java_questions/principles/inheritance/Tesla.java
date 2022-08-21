package practise_java_questions.principles.inheritance;

public class Tesla extends Car{

//    Override: Polly + morphism (Run time/ Dynamic)
//    Method we have a parent class having the same method with the same name and the same  number of parameters in child class.
//    We can't override a static method

    @Override
    public void refuel(){
        System.out.println("Tesla -- Recharge");
    }
    public void autoPilot(){
        System.out.println("AutoPilot");
    }

//    @Override
    public static void sunRoof(){
        System.out.println("Car -- Refuel");
    }

//    method overloading: Polly + morphism (Compile time)

    public void musicSystem(){
        System.out.println("Tesla music");
    }

    public void musicSystem(String cd){
        System.out.println("Tesla music");
    }
}
