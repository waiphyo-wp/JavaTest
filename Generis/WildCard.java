package Generis;

public class WildCard<T> {
    
    public static void main(String[] args) {
        // define various type by using wildcard
        WildCard<? extends Animal> wc; 
        wc = new WildCard<Animal>();
        wc = new WildCard<Bird>();
        wc = new WildCard<Elegra>();
        wc = new WildCard<Bird>();

        WildCard<? super Bird> wc2;
        wc2 = new WildCard<Animal>();
        wc2 = new WildCard<Bird>();
        
        // wc2 = new WildCard<Elegra>(); // compile error
    }


}

class Animal {}

class Bird extends Animal {}

class Elegra extends Bird {}

class Dog extends Animal{}


