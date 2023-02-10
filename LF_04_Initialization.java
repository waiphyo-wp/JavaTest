public class LF_04_Initialization {
    public static void main(String[] args) {
       new Hello(100); // initialize Hello constructor 
    }
}

class Hello {

    int count; // gloabal scope

    //constructor overloading
    Hello() {
        System.out.println(this.count = 1);
    }

    Hello(int count) {
        System.out.println(this.count = count);
    }
}