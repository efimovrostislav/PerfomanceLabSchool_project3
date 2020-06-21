package Mail;

public  class Sendable<T> {

    private String from;
    private String to;
    private T content;

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public T getContent() {
        return content;
    }
    public Sendable(String from, String to, T content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }
}