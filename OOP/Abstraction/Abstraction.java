// package OOP.Abstraction;


// public class Abstraction {
//     Animal a = new Animal("mgmgs");

//     DanceEnable d = new DanceEnable();
// }

// abstract class
abstract class Animal {

    protected String name;

    // constructor
    Animal(String name) {
        this.name = name;
    }

    // abstract method
    abstract void feed(String food);

    final void greet() {
        System.out.println("Hello I am animal ");
    }
}

// simple class to abstract class
class Monkey extends Animal {
    Monkey(String name) {
        super(name);
        name = name;
    }

    // must Override Abstract method
    void feed(String food) {
        System.out.println("I am Monkey. I am eating " + food);
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
class AsianElephant extends Elephant {

    AsianElephant(String name) {
        super(name);
    }

    // override
    void wash() {
        // System.out.println(name);
        System.out.println("I am asian elephant. I am washing ");
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

    //show animals
    void showAnimals() {
        System.out.println("[");

        for (int i = 0; i < animals.length; i++) {
            if (i>0) {
                System.out.print(", ");
            }

            System.out.print(animals[i]);
        }

        System.out.println("]");
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

interface DanceEnable {

   void dance();

}

class Robot implements DanceEnable {

    @Override
    public void dance() {
        System.out.println("Robot Dancing");
    }
}

