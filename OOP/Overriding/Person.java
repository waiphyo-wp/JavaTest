public class Person {
    String name;

    //constructor
    Person(String name) {
        this.name = name;
    }

    void greet() {
        System.out.println("Hello I am : " + name);
    }
}

class Student extends Person{
    Student(String name) {
        super(name);
    }

    @Override
    public void greet() {
        System.out.println("I am greeting : " + name);
    }
}
