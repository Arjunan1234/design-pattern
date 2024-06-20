class User implements Subscriber {
    private String username;

    public User(String username) {
        this.username = username;
    }

    @Override
    public void update(String channelName, String videoTitle) {
        System.out.println("Hey " + username + "! New video '" + videoTitle + "' uploaded on " + channelName);
    }
}