import java.util.Arrays;
import java.util.List;

public class ProxyInternet implements Internet {
    private RealInternet realInternet;
    private static final List<String> restrictedSites = Arrays.asList("blocked.com", "restricted.com");

    public ProxyInternet() {
        this.realInternet = new RealInternet();
    }

    @Override
    public void connectTo(String serverHost) {
        if (isSiteAllowed(serverHost)) {
            realInternet.connectTo(serverHost);
        } else {
            System.out.println("Access Denied! Cannot connect to " + serverHost);
        }
    }

    private boolean isSiteAllowed(String serverHost) {
        return !restrictedSites.contains(serverHost);
    }
}
