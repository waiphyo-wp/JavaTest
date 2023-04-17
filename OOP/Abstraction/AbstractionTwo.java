abstract class AbstractionTwo {
    
    public abstract void eat();
    
}

abstract class Dog extends AbstractionTwo {

    public abstract void greet();

}

class AsianDog{
    private String name;
    public AsianDog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

