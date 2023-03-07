package OOP.Encapsulation.Storage;

import java.util.Arrays;

public class StorageDemo {

    public static void main(String[] args) {
        // Storage storage = new Storage();
        Storage sto = new Storage();
        sto.add("hello");
        sto.add("Java");
        sto.add("Encapstulation");

        sto.show();

        String [] array = sto.getArray();
        
        Arrays.fill(array, null);

        sto.show();
    }
}
