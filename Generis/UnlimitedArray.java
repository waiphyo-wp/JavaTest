package Generis;
import java.util.*;

public class UnlimitedArray {
    public static void main(String[] args) {
        var arr = new Array<String>();
        arr.add("mgmg");
        arr.add("20");
        String result = arr.get(1);
        System.out.println(result);
        
    }

}


class Array<T> {

    @SuppressWarnings("unchecked")
    private T[] array = (T[])new Object[0];

    public void add(T data) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length-1] = data;
    }

    public T get(int index) {
        return array[index];
    }
}

// class UnlimitedData extends Array {
//     public T[] data;
// }
