package FindMaxNumber;

public class FindMaxNumberEx {
    
    // create state
    private int[][] history = new int[0][0];
    private boolean findMaxNum = true;

    public static void main(String[] args) {
        FindMaxNumberEx max = new FindMaxNumberEx(true);
        max.findMax(10, 50);
        max.history();

        FindMaxNumberEx min = new FindMaxNumberEx(false);
        min.findMax(30, 20);
        min.history();
    }

    //default constructor
    public FindMaxNumberEx() {

    }

    // constructor wiht parameter
    public FindMaxNumberEx(boolean max) {
        findMaxNum = max;
    }

    // find max number
    public int findMax(int d1, int d2) {

        // create array object
        var array = new int[]{d1, d2};

        // add to history
        addToHistory(array);

        return innerFind(array);
    }

    // add to history
    private void addToHistory(int[] array) {
        var copy = new int[history.length + 1][2];

        // copy history
        for (var i = 0; i < history.length; i++) {
            copy[i] = history[i];
        }

        copy[copy.length -1] = array;
        history = copy;
    }

    // innerfind max number
    private int innerFind(int [] array) {
        if (findMaxNum) {
            return array[0] > array[1] ? array[0] : array[1];
        }

        return array[0] < array[1] ? array[0] : array[1];
    }   

    // show history method
    public void history() {
        // show history of method invocation
        for (var data : history) {
            System.out.printf("D1 = %d, D2 = %d, %s Value is %d.%n",
            data[0], data[1], findMaxNum ? "Max" : "Min" , innerFind(data)
            );
        }
    }

}
