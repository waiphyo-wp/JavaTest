// package FindMaxNumber;

public class RemoveElement {
    // public static void main(String[] args) {
    //     System.out.println(removeEle(new int[] {1,2,3,4}, 1));
    // }

    public static int[] removeEle(int [] arr, int elements) {
        //{1,2,3,4},2
        // output -> {3,4}
        var result = new int[arr.length-elements];//{}

        for (var i = 0; i < result.length; i++) {
            result[i] = arr[i + elements];
        }

        return result;
    }
}
