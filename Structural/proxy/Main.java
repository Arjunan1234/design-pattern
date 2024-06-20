public class Main {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        internet.connectTo("google.com");
        internet.connectTo("example.com");
        internet.connectTo("blocked.com");
        internet.connectTo("restricted.com");
    }
}
