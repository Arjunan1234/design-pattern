public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();
        
        Vehicle car = factory.createVehicle("Car");
        car.start();
        car.stop();
        
        Vehicle motorcycle = factory.createVehicle("Motorcycle");
        motorcycle.start();
        motorcycle.stop();
    }
}
