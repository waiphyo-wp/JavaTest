// package OOP.Overriding;

public class Animals {
    
    protected String name;

    Animals(String name) {
        this.name = name;
    }

    void greet() {
        System.out.println("Hello I am " + name);
        // return null;
    }

}

class Dog extends Animals {

    // String name;

    Dog() {
        super("Aung Net");
    }

    // @Override
    void greet() {
        // TODO Auto-generated method stub
        System.out.println("I am " + name);
        // return null;
    }

}

class Cat {
    public static void main(String[] args) {
        Animals a = new Animals("kyaw kaung");
        System.out.println(a.name);
    }
}