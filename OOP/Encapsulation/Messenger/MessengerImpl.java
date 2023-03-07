package OOP.Encapsulation.Messenger;

class MessengerImpl implements Messenger{
    
    @Override
    public void send(String message) {
        System.out.println("Hello" + message);
    }

    public void greet() {
        System.out.println("Hello");
    }
}
