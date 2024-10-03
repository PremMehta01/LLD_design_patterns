
// Eager Singleton
// Singleton object is being created at the very start of application running, got created when class loads
public class Bike {

    private static Bike bike = new Bike();

    private Bike() {}

    public static Bike getInstance() {
        return bike;
    }
}
