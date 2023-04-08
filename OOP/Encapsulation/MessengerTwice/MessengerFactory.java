package MessengerTwice;

public class MessengerFactory {
    
    public static Messenger generateMessenger() {

        return new MessengerImpl();

    }


}
