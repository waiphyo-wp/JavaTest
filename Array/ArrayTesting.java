package Array;

public class ArrayTesting {
    public static void main(String[] args) {
        LargestElement.largestElement(new int[]{5,4,3,6,9,7,1} );

        int [] resultReverse = reverseArray(new int[]{1,2,3,4,5,6,7});
        System.out.print("[");
        for (int i = 0; i < resultReverse.length; i ++) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(resultReverse[i]);
        }
        System.out.println("]");

        twoDimen();
    }

    static int[] reverseArray(int[] list) {
        int[] result = new int[list.length];
        
        for (int i = 0 , j = list.length-1 ; i < list.length; i++, j--) {
            // result[0] = list[6] => result = {6}
            result[i] = list[j];
            System.out.println(result[i]);
        }

        return result;
    }

    static void twoDimen() {
        int [][] arr = new int[][]{{1,2,3,4,5}, {1,2,3,4,5,4,5,6,8}};
        System.out.println("Two Dimen");

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print("[");
            for (int j = 0; j < arr[i].length; j++) {
                if (j > 0) {
                    System.out.print(",");
                }
                System.out.print(arr[i][j]);
            }
            System.out.print("]");
        }
        System.out.println("]");
    }

}

class LargestElement {
    static void largestElement(int[] nums) {
        int [][] arr = new int[3][];

        int max = nums[0];
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] > max ) {
                max = nums[index];
            }
        }
        System.out.println("Max Val : " + max);
    }
}



