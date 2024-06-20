public class DocumentEditorDemo {
    public static void main(String[] args) {
        TextDocument document = new TextDocument();
        DocumentHistory history = new DocumentHistory();

        // User edits and saves state
        document.setContent("Hello, ");
        history.saveSnapshot(document.save());

        document.setContent("Hello, world!");
        history.saveSnapshot(document.save());

        // User wants to undo
        DocumentSnapshot snapshot = history.undo();
        document.restore(snapshot);

        System.out.println("Current content: " + document.getContent()); // Output: Hello,

        snapshot = history.undo();
        document.restore(snapshot);

        System.out.println("Current content: " + document.getContent()); // Output: Hello,
    }
}