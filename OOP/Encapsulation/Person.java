// package OOP.Encapsulation;

public class Person {
    // restrict
    protected String name;
    private String phoneNo;
    private int age;

    public Person(String name, String phoneNo, int age) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.age = age;
    }


    // setter -> to change
    // protected void setName(String name) {
    //     // idiot/value not include prevent
    //     if (name != null) {
    //         this.name = name;
    //     }
    // }

    // protected void setPhoneNo(String phoneNo) {
    //     if (phoneNo != null) {
    //         this.phoneNo = phoneNo;
    //     }
    // }

    // protected void setAge(int age) {
    //     if (age > 0 && age < 120) {
    //         this.age = age;
    //     }
    // }

    // getter -> to access
    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public int getAge() {
        return age;
    }

    public Number greet() {
        System.out.println("Hello I am %s , this is %s, I am %d years old.". formatted(name, phoneNo, age));
        return 10.3;
    }
}

class Student extends Person {
    
    // variable hiding => same variable name with super class
    private String name;

    public Student(String name, String phoneNo, int age) {
        super(name, phoneNo, age);
    }

    public void hello() {
        System.out.println(super.name); // super => to avoid variable hiding
    }

    @Override
    public Number greet() {
        System.out.println("Hello");
        return 25;
    }

}
