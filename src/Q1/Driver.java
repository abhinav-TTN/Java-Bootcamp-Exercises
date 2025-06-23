package Q1;

public class Driver {
    public static void main(String[] args) {
        House h1 = House.oneBHK;
        House h2 = House.twoBHK;
        House h3 = House.threeBHK;

        System.out.println(h1.name() + " " + h1.getPrice());
        System.out.println(h2.name() + " " + h2.getPrice());
        System.out.println(h3.name() + " " + h3.getPrice());
    }

}
