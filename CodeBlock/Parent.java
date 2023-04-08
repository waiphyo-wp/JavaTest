package CodeBlock;

public class Parent {
    public static void main(String[] args) {
        Parent p = new Parent();    
    }

    public Parent() {
        super();
        System.out.println("Constructor of Parent");
    }

    {
        System.out.println("Instance Code Block of Parent");
    }

    static {
        System.out.println("Static Code Block of Parent");
    }

    
}
