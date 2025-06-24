package Q4;

public class Main {

    public static void main(String[] args) {
        VehicleFactory fact = new VehicleFactory();

        Vehicle car = fact.getVehicle("car");
        car.run();

        Vehicle truck = fact.getVehicle("truck");
        truck.run();

        Vehicle bike = fact.getVehicle("bike");
        bike.run();
    }
}
