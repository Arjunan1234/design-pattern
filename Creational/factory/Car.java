public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started. Ready to go!");
    }
    
    @Override
    public void stop() {
        System.out.println("Car stopped. Parked.");
    }
}
