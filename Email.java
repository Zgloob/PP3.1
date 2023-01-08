public class Email extends Message {
    private User user;
    private String subject;
    private String recipientAddress;

    public String getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    Email(User user, String subject, String text) {
        super(text);
        this.user = user;
        this.subject = subject;
    }

    @Override
    public void send() {
        System.out.println(
                "To: " + user.getEmail() + "\r\n" + "Subject: " + getSubject() + "\r\n"
                        + "Message: " + getText() + "\r\n" + "Length; " + charNumber());

    }

}
