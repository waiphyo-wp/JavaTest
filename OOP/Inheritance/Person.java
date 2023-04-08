// package OOP.Inheritance;

public class Person {
    int idCard; // not own Student class
    String name = "Mg Mg"; // own Student class

    // Person() {}
    
    public Person(String name) {
        this.name = name;
    }

    void greet(String greet) { // own student class
        System.out.println("Say " + greet);
    }
}

class Student extends Person {
    String stdId = "0001";

    Student() {
        super("Kyaw Kyaw");
    }

}
