public class Level1SupportHandler implements SupportHandler {
    private SupportHandler nextHandler;

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equals("Simple issue")) {
            System.out.println("Level 1 Support: Handling simple issue");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request); 
        } else {
            System.out.println("No handler available for this request.");
        }
    }
}
