package BuilderPatterm;

// to create multiple object , instead of create multiple constructor overloading

public class BuilderDemo {
    public static void main(String[] args) {
        Hello hello = HelloBuilder.builder().name("Hello").greeting("Mgmg").build();
        System.out.println(hello);
        }
}


class Hello {
    private String name;
    private String greeting;
    private int count;
    private Hello others;

    public Hello(String name, String greeting, int count, Hello others) {

    }

}

interface Builder {
    Hello build();
}

class HelloBuilder implements Builder {

    private String name;
    private String greeting;
    private int count;
    private Hello others;

    public HelloBuilder name(String name) {
        this.name = name;
        return this;
    }

    public HelloBuilder greeting (String greeting) {
        this.greeting = greeting;
        return this;
    }

    public static HelloBuilder builder() {
        return new HelloBuilder();
    }

    public Hello build() {
        return new Hello(name, greeting, count , others);
    }


}