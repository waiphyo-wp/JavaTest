// package OOP.polymorphism;

public class MainClass {
    public static void main(String[] args) {
        Salary salary = new Salary("Kaung Thiha", "Yangon, Mayangone", 1, 1500000);
        Employee employee = new Salary("Mg Mg", "Mandalay", 2, 2500000);
        System.out.println("Call mainCheck Salary reference.....");
        salary.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference.....");
        employee.mailCheck();
    }
}