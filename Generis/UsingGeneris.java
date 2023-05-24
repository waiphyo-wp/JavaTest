package Generis;

import java.util.*;

public class UsingGeneris {
    public static void main(String[] args) {
        var strContainer = new Container<String>();
        Container<String> c = new Container<>();
        c.clean("Sock");

        // var strContainer1 = new Container<Date>();

        strContainer.add("Hello Java");

        String hello = strContainer.get(0);

        // strContainer1.add(new Date());
        // strContainer.add(strContainer);
        // strContainer.add(1000);

        // var date = (Date)strContainer.get(1);

        System.out.println(hello);
        System.out.println(strContainer.size());
        System.out.println(Arrays.toString(strContainer.getAll()));
        // System.out.println(Arrays.toString(strContainer1.getAll()));

        // System.out.println(date.getDay());
    }
}

class Container<T> {

    @SuppressWarnings("unchecked")
    private T[] array = (T[])new Object[0];
    T item;

    public void clean(T item) {
        System.out.println( "Clean" + item);
    }

    public void add(T message) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length -1] = message;
    }

    public int size() {
        return array.length;
    }

    public T get(int index) {
        return array[index];
    }

    public T[] getAll() {
        return Arrays.copyOf(array, array.length);
    }
}
