package Generis;

public class TypeParameter {
    public static void main(String[] args) {
        
        // give generics type value

        // java 5 - 6
        Pairs<String , Integer> pair = new Pairs<String, Integer>();
        // jav 7 - 9
        Pairs<String, Integer> pairs = new Pairs<>();

        // java 10
        var pairOne = new Pairs<String, Integer>();
        
    }
}

// single type parameter
class Container<T> {

}

// multiple type parameter
class Pairs<K, V> {

    private K key;
    private V val;

    // Pairs(K key, V val) {

    // }

    public void setKey(K key) {
        this.key = key;
    }

}

// one way type defined
class SubPair extends Pairs<String, Integer> {
    
    // SubPair(String key, Integer val) {
    //     super(null, null);
    // }
}

// another way type defined
class SubPairTwo<K, V> extends Pairs<K, V> {
    // SubPairTwo(String str, Integer num) {
    //     super(null, null);
    // }
}
