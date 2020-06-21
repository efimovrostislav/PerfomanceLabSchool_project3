package Mail;

public class MailMessage extends Sendable<String> {

    private String from;
    private String to;
    private String content;

    public MailMessage(String from, String to, String content) {
        super(from, to, content);
    }

    public void setFrom(String from) {
        this.from = from;
    }
    public void setTo(String to){
        this.to=to;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }
}