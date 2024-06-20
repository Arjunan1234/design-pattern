public class Level2SupportHandler implements SupportHandler {
    private SupportHandler nextHandler;

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equals("Complex issue")) {
            System.out.println("Level 2 Support: Handling complex issue");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request); 
        } else {
            System.out.println("No handler available for this request.");
        }
    }
}
