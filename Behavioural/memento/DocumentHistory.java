import java.util.Stack;

public class DocumentHistory {
    private Stack<DocumentSnapshot> snapshots = new Stack<>();

    public void saveSnapshot(DocumentSnapshot snapshot) {
        snapshots.push(snapshot);
    }

    public DocumentSnapshot undo() {
        if (!snapshots.isEmpty()) {
            return snapshots.pop();
        }
        return null;
    }
}
