package CodeBlock;

public class CodeBlock {
    
    private String name = "helloi";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // instance code block
    {
        System.out.println("Instance code Block");
    }

    // static code block => use to declare static member
    static {
        // String name = "mg mg";
        System.out.println("Static code Block");
    }


    public void doSomething() {
        System.out.println("hello do Something " + name);
    }
}
