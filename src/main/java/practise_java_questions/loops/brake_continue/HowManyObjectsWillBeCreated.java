package practise_java_questions.loops.brake_continue;

public class HowManyObjectsWillBeCreated {
    public static void main(String[] args) {

        String h1 = ("Hello World");

//        Java memory consists of heap and stack. The "h1" will be stored in the stack section.
//        Heap includes string constant pool (SCP ----> "Hello World) and object ("Hello World) inside.

//            Answer: 2 objects (Inside SCP "Hello world" and inside object) on the heap section.
//            But if we create a new h2 with "Hello World", it won't create a new record into SCP.

    }
}
