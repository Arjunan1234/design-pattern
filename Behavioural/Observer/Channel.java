import java.util.ArrayList;
import java.util.List;

class Channel implements YouTubeChannel {
    private String channelName;
    private List<Subscriber> subscribers;

    public Channel(String channelName) {
        this.channelName = channelName;
        this.subscribers = new ArrayList<>();
    }

    public void uploadVideo(String videoTitle) {
        System.out.println("New video uploaded on channel '" + channelName + "': " + videoTitle);
        notifySubscribers(videoTitle);
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String videoTitle) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(channelName, videoTitle);
        }
    }
}