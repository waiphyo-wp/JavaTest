package CodeBlock;

public class Child extends Parent {
    {
        System.out.println("Instance Code Block of Child");
    }

    static {
        System.out.println("Static Code Block of Child");
    }

    public Child() {
        super();
        System.out.println("Constructor of Child");
    }

    public void doSomethid() {
        System.out.println("Hello DoSomething");
    }
}
