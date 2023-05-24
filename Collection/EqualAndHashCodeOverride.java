package Collection;

import java.util.HashSet;

public class EqualAndHashCodeOverride {
    public static void main(String[] args) {
        var d1 = new Data("Hello");
        var d2 = new Data("Hello");

        // can solve these false problem, we can override equals methods
        System.out.println(d1.equals(d2)); // false , equal value but different object
    
        // when we use HashSet collection , must solve duplicate problem
        // var set = new HashSet<Data>();
        // set.add(d1);
        // set.add(d2);
        // System.out.println(set); // [Hello, Hello] / this is illegal HashSet collection, values must not duplicate
        // System.out.println(d1.hashCode()); // 622488023
        // System.out.println(d2.hashCode()); // 1933863327

        // we need to override hashCode()
        System.out.println(d1.hashCode()); // 69609650
        System.out.println(d2.hashCode()); //  69609650
        
        var set = new HashSet<Data>();
        set.add(d1);
        set.add(d2);
        System.out.println(set); // [Hello]
    }
}

class Data {
    private String value;

    public Data(String value) {

        if (value == null) {
            throw new IllegalArgumentException();
        }

        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public String getValue() {
        return value;
    }

    // can solve different object problem, we can override equals methods
    @Override
    public boolean equals(Object obj) {
        if (null != obj) {
            Data d = (Data)obj; // type cast
            return this.value.equals(d.value);
        }
        return false;
    }

    // if equals override, we need to override hashCode()
    @Override
    public int hashCode() {
        return value.hashCode();
    }

}