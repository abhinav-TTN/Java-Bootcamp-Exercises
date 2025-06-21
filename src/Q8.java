public class Q8 {
    public static void main(String[] args) {
        /*
        Supposed we have a class AnotherClass.java that was compiled and converted to .class file along with the current file Q8.java.
        But then we delete the AnotherClass.class file and run the Q8.class file using 'java Q8'.
        The Q8 class tries to access the greet() function from AnotherClass.class, but it does not exist and the program throws a NoClassDefFoundError.
         */

//        AnotherClass c = new AnotherClass();      //throws error when executing the program
//        c.greet();

        /*
        When we try to dynamically load a class using Class.forName() and it does not exist then the compiler throws a ClassNotFoundException.
         */

        try {
            Class.forName("NonExistingClass");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Class not found.");
        }
    }
}
