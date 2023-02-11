import java.util.Scanner;

public class LF_04_Loading_Class {
    public static void main(String[] args) {

        System.out.println("Start Program");
        Scanner sc = new Scanner(System.in);
        sc.nextLine(); // wait program

        LoadDemo demo;
        System.out.println("Declare Class");
        sc.nextLine();

        //first time loading class
        demo = new LoadDemo();
        System.out.println("Create Obj from LoadDemo class");
        sc.nextLine();

        //second time loading class
        demo = new LoadDemo();
        System.out.println("Create Obj again");
        sc.nextLine();

    }
}

class LoadDemo {
    //static block
    static {
        System.out.println("static block");
    }

    //instant block
    {
        System.out.println("instant block");
    }

    //constructor
    LoadDemo() {
        System.out.println("Constructor");
    }
}