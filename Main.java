public class Main {
    public static void main(String args[]) {
        User Jim = new User("Jim", "Halpert", "jimhalpert@dundermifflin.com", 766544324);
        User Dwight = new User("Dwight", "Schrute", "dwightschrute@dundermifflin.com", 156634578);
        Message first = new SMS(Jim, "Hello, Dwight speaking!");
        Message second = new SMS(Dwight, "Identity theft is not a joke Jim, millions of families suffer every year!");
        first.send();
        second.send();

        Message third = new Email(Jim, "Report", "Michaeeeeeel!!!");
        Message fourth = new Email(Dwight, "Replying",
                "Oh that's funny! Michaeeeeel!!!");
        third.send();
        fourth.send();

    }
}