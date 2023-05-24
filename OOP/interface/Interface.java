// package OOP.interface;

public class Interface implements MyInterface {
    public static void main(String[] args) {
        // System.out.println(MyInterface.num2);
        // MyInterface.num2 = 10;

        // System.out.println();
        // MyInterface.myMethod();
        
        Interface myinterface = new Interface();
        
        myinterface.doSomething();
        myinterface.run();
        
    }

    @Override
    public void doSomething() {
        System.out.println("hello");
    }

    @Override
    public void run() {
        System.out.println("run method");
    }
}

interface MyInterface {
    // variable
    // default => public static final variable (Yes)
    // Instance Variable => No
    // Static Variable => No

    // int num = 10; // default => public static final variable 

    // static int num2 = 20;

    // Method
    // Constructor => No
    // public MyInterface() {

    // }

    // static method with body => yes
    // static void myMethod() {
    //     System.out.println("static interface method");
    // }

    // default method with body => yes 
    default void doPlay() {
        
    }

    // instant method with body => no
    // void doSomething() {

    // }

    // public abstract method => yes
    public void doSomething(); // interface methods

    public abstract void run();

    // private concrete method => yes
    // private void doAction() {
    //     System.out.println("doAction method");
    // }
}

// class Main {
//     public static void main(String[] args) {
        
//     }
// }


interface Interface1 {
    String getVal () ;
    public final static void main(String[] args) {
        
    }
}

abstract class Interface2 implements Interface1 {
    int [] nums [] = new int[][]{{0,0}};
}

interface Interface3 extends Interface1 , Interface2 {

}