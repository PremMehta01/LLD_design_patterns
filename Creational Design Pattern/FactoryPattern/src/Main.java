//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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