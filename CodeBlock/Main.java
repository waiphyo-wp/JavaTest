package CodeBlock;

public class Main {
    public static void main(String[] args) {
        System.out.println("program start");
        // doSomething();
        // System.out.print(doSomething());
        CodeBlock doSom = new CodeBlock();
        // doSom.name;
        doSom.doSomething();

        doSom.setName("aung aung");

        System.out.println(doSom.getName());
    }
}
