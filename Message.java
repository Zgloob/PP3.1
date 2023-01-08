public abstract class Message {
    private String text;

    Message() {
    };

    Message(String text) {
        this.text = text;
    }

    public int charNumber() {
        return (getText().length());
    }

    public abstract void send();

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
