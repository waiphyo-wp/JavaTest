import java.util.Arrays;

public class LF_08_Array {
    public static void main(String[] args) {
        
        //multidimensional array
        // int array[][] = {{1,2,3}};

        // System.out.println(array[0][2]);

        //specific element two dimensional array
        // int [][] num = {{1,2},{3,4}};
        // System.out.println(num[0][1]);

        //not known specific element two dimensional array
        // int [][] num1 = new int[3][3];
        //assign
        // num1[0] = new int[]{1,2};
        // System.out.println(num1[0][0]);

        //three dimensional array
        // int [][][] threeDimenArr = {
        //     {
        //         {1,2,3},{4,5,6}
        //     },
        //     {
        //         {7,8,9}
        //     }
        // };

        // System.out.println(threeDimenArr[0][0][2]);

        // for (int[][] firstArr : threeDimenArr) {
        //     for (int[] secondArr : firstArr) {
        //         for (int thidArr : secondArr) {
        //             System.out.println(thidArr);
        //         }
        //     }
        // }

        // int [][][] thidDimArr = new int[3][6][2];
        //assign
        // thidDimArr[0][5] = new int[]{1,2,3,5};

        // System.out.println(thidDimArr[0][5][2]);
        
        /*
         * Array's Utility Class or build-in Method
         * 1. sort
         * 2. copyOf
         */

         String [] nameList = {"Zaw Zaw", "Kyaw Kyaw", "Ci Thu", "Aung Aung"};
        
         //sort
         Arrays.sort(nameList);
         for (int i = 0; i < nameList.length; i++) {
             System.out.println("Sorting Array " + nameList[i]);
         }

         //copyOf => copy array
         String[] copyNameList = Arrays.copyOf(nameList, 2); 
         for (int i = 0; i < copyNameList.length; i++) {
            System.out.println("Copy Sorting Array " + nameList[i]);
        }

        //copyOfRange => copy range
        String [] copyRangeNameList = Arrays.copyOfRange(nameList, 1, 4) ;
        for (String newCopyRangeNameList : copyRangeNameList) {
            System.out.println(newCopyRangeNameList);
        }
    }
}
