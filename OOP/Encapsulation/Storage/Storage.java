package OOP.Encapsulation.Storage;

import java.util.Arrays;

public class Storage {
    private String [] array = {};

    public boolean add(String data) {
        if (data != null) {
            array = Arrays.copyOf(array, array.length + 1);

            array[array.length - 1] = data;
            return true;
        }
        return false;
    }

    public String [] getArray() {
        return array;
    }

    public void show() {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.print("]");
    }
}
