public class Main {
    public static void main(String[] args) {
        Channel myChannel = new Channel("My Channel");

        Subscriber subscriber1 = new User("Arjun");
        Subscriber subscriber2 = new User("Subu");

        myChannel.subscribe(subscriber1);
        myChannel.subscribe(subscriber2);

        myChannel.uploadVideo("Java Basics");
        myChannel.uploadVideo("Introduction to Design Patterns");

        myChannel.unsubscribe(subscriber2);

        myChannel.uploadVideo("Advanced Java Programming");
    }
}