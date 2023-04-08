abstract class AbstractionTwo {
    
    public abstract void eat();
    
}

abstract class Dog extends AbstractionTwo {

    public abstract void greet();

}

class AsianDog extends Dog {

    @Override
    public void eat() {
        System.out.println("I am eating");
    }

    @Override
    public void greet() {
        System.out.println("Greeting");
    }
}

