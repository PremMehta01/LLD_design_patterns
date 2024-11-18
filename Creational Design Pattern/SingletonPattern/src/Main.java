
public class Main {
    public static void main(String[] args) {

        Car car = Car.getInstance();
//        Car c = new Car(); // not possible because car constructor is private
        System.out.println(car.hashCode());

        Car car2 = Car.getInstance();
        System.out.println(car2.hashCode());


        Bike bike = Bike.getInstance();
        System.out.println(bike.hashCode());

        Bike bike2 = Bike.getInstance();
        System.out.println(bike2.hashCode());
    }
}