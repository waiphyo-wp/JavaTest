// package OOP.Inheritance;

public class MachineDemo {
    public static void main(String[] args) {
        Machine machine = new Machine("Machine", 12);

        // machine.machineStart();

        Car car = new Car("Toyota Car", 122);

        // Car car2 = (Car)machine;

        // car2.machineStart();

        Machine machine2 = car;

        machine2.machineStart();

        car.machineStart();

        car.task(car);

    }
}
