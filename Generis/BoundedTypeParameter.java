package Generis;

public class BoundedTypeParameter {
    public static void main(String[] args) {
        // Number and Number's sub class accept
        var container = new Container<Integer>();
    }
    
}

// bounded type parameter (restrict types parameter > Number and Number's sub class accept)
class Container<T extends Number> {

}
