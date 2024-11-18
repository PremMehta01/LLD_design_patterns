
public class Main {
    public static void main(String[] args) {
        Vehicle carVehicle = VehicleFactory.getVehicle("Car");
        System.out.println(carVehicle.getVehicleType());
        

//        Vehicle bikeVehicle = VehicleFactory.getVehicle("Bike");
//        System.out.println(bikeVehicle.getVehicleType());

        Vehicle truckVehicle = VehicleFactory.getVehicle("Truck");
        System.out.println(truckVehicle.getVehicleType());
    }
}