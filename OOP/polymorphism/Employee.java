// package OOP.polymorphism;

public class Employee {
    // state
    private String name;
    private String address;
    private int number;

    // constructor
    public Employee(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    // instance method
    public void mailCheck() {
        System.out.println("Mail check by : " + name + " " + address);
    }

    // change String 
    public String toString() {
       return name + " " + address + " " + number;
    }

    // getter and setter
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumber() {
        return number;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

}
