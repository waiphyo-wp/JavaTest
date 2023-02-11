public class LF_01_Test {
    public static void main(String[] args) {
        // Demo nameDemo = new Demo();
        // nameDemo.typeOfName();

        Counter c1 = new Counter();
        Counter c2 = new Counter();

        //instant varibale
        c1.name = "Counter C1";
        c2.name = "Counter C2";

        //instant variable
        c1.countUp();
        c2.countUp();
    }
}

/*
 * 
 class Demo {
     //global variable
     String humanName = "Wai Phyo";
 
     //method
     void typeOfName() {
         //local variable
         //final keyword not update value
         final int num = 2;
         System.out.println(humanName+num);
 
 
     }
 }
 * 
 */

 // instant variable and static variable
 // instant variable => object => copy new
 // static variable => class => don't copy new

class Counter {
    String name;
    //static variable
    static int count;

    void countUp() {
        count++;
        System.out.println("Count of Name : " + name + " - " + count);
    }
}

class Test {
}