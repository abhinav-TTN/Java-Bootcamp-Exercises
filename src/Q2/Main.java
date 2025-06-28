package Q2;

public class Main implements DemoInterface{
    public static void main(String[] args) {

        // Creating object of class Main that implements DemoInterface and then calling showName() using the class object.
        Main m = new Main();
        m.showName("Abhinav");


        // Calling static method in interface directly without implementing it and creating an object.
        System.out.println("Current time : " + DemoInterface.showDate());

    }
}
