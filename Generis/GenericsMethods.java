package Generis;

public class GenericsMethods {
    public static void main(String[] args) {
        Pair<String, Integer> pair = PairFactory.generatePair("Mg Mg", 20);
        pair.show();
    }
}

class Pair<K, V> {
    
    private K key;
    private V val;

    Pair(K key, V val) {
        this.key = key;
        this.val = val;
    }

    public void show() {
        System.out.printf("Key : %s, Value : %s%n", key, val);
    }

}

class PairFactory {
    // generic method
    public static <K extends CharSequence, V extends Number> Pair<K, V> generatePair(K key, V val) {
        return new Pair<>(key, val);
    }
}
