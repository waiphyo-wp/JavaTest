/**
 * Method
 */
public class LF_02_Method {

    public static void main(String[] args) {

        // create object class name => can call instance metod and instance variable
        // LF_02_Method instantDemo = new LF_02_Method();
        // instantDemo.instanceMethod();
        // System.out.println(instantDemo.instanceVariable);

        //call static method => can call
        // staticMethod();
        //call static variable => can call
        // System.out.println(staticVariable);

        //call instance Method => can't call instance method
        // instanceMethod();

        //call instance variable => can't call instance variable
        // System.out.println(instanceVariable);

        // method invoking => call method
        // hello("agag", 20);
        // hello("h el lo");
        
        // hello1("hello");
        // checkAge(2, "mg mg");
        
    }

    /*
    Static Method & Instance Method
        Static Method => can call static method and static variable 
        Instance Method => can call static method , static 
            variable and Instance method, Instance variable
    */

    // Static Method
    // static void staticMethod() {
    //     System.out.println("hello Static Method");
    // }

    // Static Variable
    // static String staticVariable = "Hello Static Var";

    // Instance Method 
    // void instanceMethod() {
    //     System.out.println("Hello Instance Method");
        // can call static method and static variable
        // staticMethod();
        // System.out.println(staticVariable);
    // }

    // Instance Variable
    // String instanceVariable = "Hello Instance Var";

    /*
        need to write method 
            1.Return type => void, String, interface
            2.Method name => hello
            3.Arguments => ()
            4.Method body => { }
    */

    // return type void
    // static void hello() {
    //     System.out.println();
    // }

    // String hello(String name, String lastName) {
    //     return "hello";
    // }

    // multi arg ( , )
    // static void hello(String name, int num) {
        
    //     System.out.println(name);
    //     System.out.println(num);
    // }

    // varages (variable arguments) => want to accept multi string parameter
    // static void hello1(String ... name) {
    //     for (String str : name) {
    //         System.out.println(str);
    //     }
    // }

    // static void hello1(String num,String ... name) {
    //     System.out.println(num);
    //     for (String str : name) {
    //         System.out.println(str);
    //     }
    // }

    // access person program
    /* 
    static void checkAge(int age , String name) {
        if (age < 18) {
            System.out.println("you cannot access !!! " + name);
        } else {
            System.out.println("Welcome " + name);
        }
    }
    */

}