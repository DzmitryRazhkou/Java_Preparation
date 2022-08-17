package practise_java_questions.Try_Catch;

public class TryCatchBlock {

    String name;

    public static void main(String[] args) {

//        Exception --->>> Error (Class) ...... Throwable

        int base = 0;

        System.out.println("The Starting Point...");
        System.out.println(">>> ... <<<");

        try {
            TryCatchBlock obj = new TryCatchBlock();

//            obj = null;   //java.lang.NullPointerException

            obj.name = "Gans";
            System.out.println(obj.name);

            int i = 9 / base;
        } catch (Exception e) {
            System.out.println("Some Exception is Coming...");
            e.printStackTrace();
        }
//        catch (NullPointerException e) {
//            System.out.println("NullPointerException is Coming...");
//            e.printStackTrace();

            System.out.println("Bye...");

        }
    }
