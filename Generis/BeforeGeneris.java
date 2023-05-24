package Generis;

import java.util.*;

public class BeforeGeneris {
    public static void main(String[] args) {
        var strContainer = new BefContainer();

        strContainer.add("Hello Java");

        var hello = strContainer.get(0);

        strContainer.add(new Date());
        strContainer.add(strContainer);
        strContainer.add(1000);

        var date = (Date)strContainer.get(1);

        System.out.println(hello);
        System.out.println(strContainer.size());
        System.out.println(Arrays.toString(strContainer.getAll()));
        System.out.println(date.getDay());
    }
}

class BefContainer {
    private Object [] array = {};

    public void add(Object message) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length -1] = message;
    }

    public int size() {
        return array.length;
    }

    public Object get(int index) {
        return array[index];
    }

    public Object[] getAll() {
        return Arrays.copyOf(array, array.length);
    }
}
