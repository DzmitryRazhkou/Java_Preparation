package practise_java_questions.principles.Exceptions_Static;

public class Person_Both {
    private String name;
    private static String xx;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person_Both(String name) {
        this.name = name;
    }

    public static void hello(){
        System.out.println("hello");
        System.out.println(xx);
    }

    public void hey(){
        System.out.println(this.name);
        System.out.println(xx);
        hello();
    }



    public void setXx(String x){
        xx = x;

    }

    public String getXx (){
        return xx;
    }
}
