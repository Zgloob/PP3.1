public class SMS extends Message {
    private User user;

    SMS(User user, String text) {
        super(text);
        this.user = user;
    }

    @Override
    public void send() {
        System.out.println(
                "From: " + user.getPhoneNumber() + "\r\n" + "Message: " + getText() + "\r\n" + "Length; "
                        + charNumber());

    }

}
