package OOP.Encapsulation;

import OOP.Encapsulation.Messenger.Messenger;
import OOP.Encapsulation.Messenger.MessengerFactory;

public class MessengerDemo {
    public static void main(String[] args) {
        Messenger m = MessengerFactory.generate();
        
        m.send("Mg Mg");

        System.out.println(m.getClass());
    }
}
