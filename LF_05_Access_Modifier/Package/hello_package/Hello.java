package LF_05_Access_Modifier.Package.hello_package;

public class Hello {
    public void greet() {
        System.out.println("Say Hello from hello_package!!!");
        LF_05_Access_Modifier.Package.hello_package.sub.SubClass subClass = new LF_05_Access_Modifier.Package.hello_package.sub.SubClass();
        subClass.greet();
    }
}
