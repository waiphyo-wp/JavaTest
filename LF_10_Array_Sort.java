import java.util.Arrays;

public class LF_10_Array_Sort {
    public static void main(String[] args) {
        int[] array = {10,99,4,3,8,23,-4,100};

        //sort array build in method
        Arrays.sort(array);

        // show array data 
        showArrayData(array);

        // sortArray(array);
        sortArray(array);
    }

    // sorting array
    static void sortArray(int [] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    // show data
    static void showArrayData(int [] arr) {
        // show array as [-4 , ...... , .]

        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            //separate ,
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }

        System.out.println("]");
    }
}
