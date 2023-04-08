package Array.copy_array;

import java.util.Arrays;

public class CopyArrayDemo {
    public static void main(String[] args) {
        CopyArray c = new CopyArray();

        c.addDataToArray("Mg Mg");
        c.addDataToArray("Ag Ag");
        c.addDataToArray("Zaw Zaw");

        c.showArray();

        String [] copyArray = c.getArrayData();
        // fill original array to null
        Arrays.fill(copyArray, null);

        c.showArray();
        
    }
}

