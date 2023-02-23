import javax.lang.model.element.Element;
// package FindMaxNumber;

public class AddElement {
    public static int[] addEle(int [] arr, int addElements) {

        //null => {addElements}
        //{} = > {addElements}
        if (arr == null || arr.length == 0) {
            return new int[]{addElements};
        }

        var result = new int[arr.length + 1]; // {0}

        //add element last index
        result[result.length -1] = addElements; // {10}

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        return result;

        
    }
}
