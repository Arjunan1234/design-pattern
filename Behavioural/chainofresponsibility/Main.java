public class Main {
    public static void main(String[] args) {
        SupportHandler level1Handler = new Level1SupportHandler();
        SupportHandler level2Handler = new Level2SupportHandler();

        level1Handler.setNextHandler(level2Handler);

        level1Handler.handleRequest("Simple issue");
        level1Handler.handleRequest("Complex issue");
        level1Handler.handleRequest("Unknown issue");
    }
}
