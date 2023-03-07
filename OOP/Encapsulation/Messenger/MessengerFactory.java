package OOP.Encapsulation.Messenger;

public class MessengerFactory {

    public static Messenger generate() {
        return new MessengerImpl();
    }
    
}
