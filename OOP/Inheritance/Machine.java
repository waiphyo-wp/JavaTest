// package OOP.Inheritance;

public class Machine {

    protected String name;
    protected int machineNo;

    public static void main(String[] args) {
        Machine m = new Machine(null, 0);

        // Car c = new Car(null, 0);

        // Machine m = c;

        // Car c = m;
        

    }

    public Machine(String name, int machineNo) {
        this.name = name;
        this.machineNo = machineNo;
    }

    public void machineStart(){
        System.out.println("Parent Machine Starting  %s . Machine Id %d".formatted(name, machineNo));
    }

}

class Car extends Machine {

    // super call
    public Car(String name, int machineNo) {
        super(name, machineNo);
    }

    @Override
    public void machineStart() {
        System.out.println("Child Machine Starting %s . Machine Id %d".formatted(name, machineNo));
    }

    public void task(Machine machine) {
        machine.machineStart();
    }

}
