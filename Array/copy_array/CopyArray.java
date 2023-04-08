package Array.copy_array;

import java.util.Arrays;

public class CopyArray {
    
    private String [] array = {};

    // add data to array
    public boolean addDataToArray(String data) {

        if (data != null) {
            array = Arrays.copyOf(array, array.length + 1);
            array[array.length -1] = data;

            return true;
        }
        return false;
    }

    // get array
    public String [] getArrayData() {
        return array;
    }

    // show array
    public void showArray() {
        System.out.print("[");
        
        for (int i = 0; i < array.length; i++) {
            if (i>0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }

        System.out.println("]");
    }
}
