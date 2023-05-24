package Generis;

public class GenericsAndSubTyping {
    public static void main(String[] args) {
        
    }
}

class Animal {

}

class Dog extends Animal {

}

class Container<T> extends Animal {

}

class SubContainer<T extends Animal> extends Container {
    
}
