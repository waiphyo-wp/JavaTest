package DeadlyDeadOfDiamond;

interface InterfaceA {
    default void doJob() {
        System.out.println("Interface A Job");
    }
}
interface InterfaceB extends InterfaceA {
    default void doJob() {
        System.out.println("Interface B Job");
    }
}
interface InterfaceC extends InterfaceA {
    default void doJob() {
        System.out.println("Interface C Job");
    }
}
interface InterfaceD extends InterfaceB, InterfaceC {
    // firstly overrde method
    default void doJob() {
        InterfaceC.super.doJob();
    }
}
public class Ddod {
    public static void main(String[] args) {
        var interfaceD = new InterfaceD() {};
        interfaceD.doJob(); // InterfaceD job

        // call static method
        TestStaticPrivate.staticMethod(); // ok

        // call private method
        // TestStaticPrivate.privateMethod(); // not ok
    }
}

// static method and private method

interface TestStaticPrivate {
    // static method
    static void staticMethod() {
        System.out.println("static methods");
    }

    private static void privateMethod() {
        System.out.println("private method");
    }
}
