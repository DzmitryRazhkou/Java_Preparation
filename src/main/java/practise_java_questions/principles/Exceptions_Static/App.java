package practise_java_questions.principles.Exceptions_Static;

public class App {
    public static void main(String[] args) {

        PersonNonStatic person1 = new PersonNonStatic();
        person1.hello();

//      When I call static function, I will not create the object of class. I call directly from name of class.
//      Non-static function belongs to object, but static belongs to class.

        PersonStatic.hello();

        Person_Both.hello();
        Person_Both person2 = new Person_Both("Dava");

//        We can't get static function from object.
//        We can get static fields and another static function from static only.
//        But from non-static function we can call both function.

//        Let's create static function.

        person2.hey();



    }
}
