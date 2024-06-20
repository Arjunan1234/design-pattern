public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();

        homeTheater.watchMovie("Inception");

        System.out.println("\n=== Movie ends, shutting down ===\n");

        homeTheater.endMovie();
    }
}