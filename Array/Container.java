package Array;

import java.util.Arrays;

public class Container {
    private int[] array = new int[]{};


    public static void main(String[] args) {
        Container c = new Container();
        // Container c1 = new Container();
        
        System.out.println(c.add(new int[]{} , 4));
        // System.out.println(c.add(new int[]{} , 4));

        int[] getArray = c.get();
        System.out.print("[");
        for (int i = 0; i < getArray.length; i++) {
            if (i > 0) {
                System.out.print(",");
            }

            System.out.print(getArray[i]);
        }
        System.out.println("]");

    }

    public int add(int [] array, int element) {

        int[] copyArray = new int[array.length + 1];

        copyArray[copyArray.length-1] = element;

        for (int i = 0; i < array.length; i++) {
            copyArray[i] = array[i];
        }

        this.array = copyArray;

        return copyArray.length-1;
    }

    public int[] get() {

        // int[] arrayList = Arrays.copyOf(array, this.array.length);

        return array;
    }



}