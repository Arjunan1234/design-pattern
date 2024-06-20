public interface SupportHandler {
    void handleRequest(String request);
    void setNextHandler(SupportHandler nextHandler);
}
