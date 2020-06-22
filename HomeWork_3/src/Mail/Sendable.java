package Mail;

public  class Sendable<T> {

    protected String from;
    protected String to;
    protected T content;

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