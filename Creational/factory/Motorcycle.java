public class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle started. Let's ride!");
    }
    
    @Override
    public void stop() {
        System.out.println("Motorcycle stopped. Stopped.");
    }
}
