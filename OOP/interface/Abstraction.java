// package OOP.Abstraction;

// abstract class
abstract class Animal {

    protected String name;

    // constructor
    Animal(String name) {
        this.name = name;
    }

    // abstract method
    abstract void feed(String food);

    public void greet(String name) {
        System.out.println("Hello I am animal " + name);
    }
}

// interface
interface DanceEnable {
    void dance(); // interface method
}

// simple class to abstract class & implements interface
class Monkey extends Animal implements DanceEnable {
    
    Monkey(String name) {
        super(name);
    }

    // must Override Abstract method
    void feed(String food) {
        System.out.println("I am Monkey. I am eating " + food);
    }

    // override interface method
    @Override
    public void dance() {
        System.out.println("Mankey Dancing!!!!");
    }
}

// abstract class to simple class
abstract class PetMokey extends Monkey {
    PetMokey(String name) {
        super(name);
    }
    // abstract void dance();
}

// abstract class to abstract class
abstract class Elephant extends Animal {

    Elephant(String name) {
        super(name);
    }

    abstract void wash();

    // may or may not
    void feed(String food) {
        System.out.println("I am Elephant. I am eating " + food);
    }
}

// simple class to abstract class
class AsianElephant extends Elephant implements DanceEnable {

    AsianElephant(String name) {
        super(name);
    }

    // override
    void wash() {
        // System.out.println(name);
        System.out.println("I am asian elephant. I am washing ");
    }

    // override interface method
    public void dance() {
        System.out.println("Asian Elephant Dancing!!!!");
    }
}

class zoo {
    private Animal [] animals = new Animal[10];

    boolean add(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                return true;
            }
        }

        return false;
    }

    // feed method
    void feed(String food) {
        for (Animal a : animals) {
            if (a != null) {
                a.feed(food);
            }
        }
    }

    // wash method
    void wash() {
        for (Animal a : animals) {
            if (a instanceof Elephant) {
                Elephant e = (Elephant)a;
                e.wash();
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        // Monkey monkey = new Monkey("justiceMonkey");
        // monkey.greet(monkey.name);


        // void dance(DanceEnable dancer) {
        //     dancer.dance();
        // }
    }
}