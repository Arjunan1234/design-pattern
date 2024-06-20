public class TextDocument {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public DocumentSnapshot save() {
        return new DocumentSnapshot(content);
    }

    public void restore(DocumentSnapshot snapshot) {
        content = snapshot.getContent();
    }
}