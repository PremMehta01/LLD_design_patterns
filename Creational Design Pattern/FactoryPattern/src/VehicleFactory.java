public class VehicleFactory {


    public static Vehicle getVehicle(String vehicleType) {
        if(vehicleType ==  null) return null;

        switch (vehicleType.toLowerCase()) {
            case "car":
                return new Car();
            case "truck":
                return new Truck();
            default:
                return null;
        }
    }
}
