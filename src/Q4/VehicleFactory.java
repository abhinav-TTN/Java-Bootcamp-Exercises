package Q4;

public class VehicleFactory {
    public Vehicle getVehicle(String type) {
        if (type == null) return null;
        switch (type) {
            case "car":
                return new Car();
            case "truck":
                return new Truck();
            case "bike":
                return new Bike();
            default: return null;
        }
    }
}
