
// Lazy Singleton
// Create first time object when user calls getInstance method, got created when required for the first time
public class Car {

    private static Car car;

    private Car(){

    }


    // NOT thread safe
//    public static Car getInstance(){
//        if(car == null) {
//            car = new Car();
//        }
//
//        return car;
//    }


    // thread safe
    public static Car getInstance(){
        if(car == null) {
            synchronized(Car.class) {
                if(car == null) {
                    car = new Car();
                }
            }
        }
        return car;
    }
}
