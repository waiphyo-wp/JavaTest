import java.util.Scanner;

public class LF_07_MultiReference {
    public static void main(String[] args) {
        //obj
        Counter c1 = new Counter("C1");
        c1.countUp();

        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println(s1);

        //mult reference
        Counter c2 = c1;
        c2.setName("C2");
        c2.countUp();

        Counter c3 = new Counter(null);
        c3.setName("C3");
        c3.countUp();

    }
}

class Counter {

    //var
    private String name;
    private int count;

    //constructor
    Counter(String name) {
        this.name = name;
    }

    //method
    void setName(String name) {
        this.name = name;
    }

    //method
    void countUp() {
        ++ count;

        System.out.println(name + ":" + count);
    }

}