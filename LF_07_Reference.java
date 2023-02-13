public class LF_07_Reference {

public static void main(String[] args) {
    
    //obj
    Student s1 = new Student("Aung Aung");
    sayHello(s1);

    //
    s1 = new Student("Thida");

    sayHello(s1);

}

//method
static void sayHello(Student std) {
    std.greet();
}

}

class Student {
    //var
    private String name;

    //constructor
    Student(String name) {
        this.name = name;
    }

    //method
    void greet() {
        System.out.println("Hello I am " + name);
    }
}
