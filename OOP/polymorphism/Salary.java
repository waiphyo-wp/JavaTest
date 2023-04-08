// package OOP.polymorphism;

public class Salary extends Employee {
    private double salary;

    // call super cause Extend Employee
    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    @Override
    public void mailCheck() {
        System.out.println("Witihin mailCheck of Salary class ");
        System.out.println("Mailing check by " + getName() + " with salary " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        // avoid ediot users
        if (newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    // compute pay
    public double computePay() {
        System.out.println("Computing salary pay for " + getName());
        return salary/52;
    }
}
