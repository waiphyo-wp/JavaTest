package FindMaxNumber;

public class FindMaxNumber {
    // create state
    private int[][] history = new int[0][0];
    private boolean findMaxNum = true;

    //main method
    public static void main(String[] args) {
        FindMaxNumber max = new FindMaxNumber(true);
        max.findMax(2, 0);
        max.findMax(10, 30);
        max.history();

        FindMaxNumber min = new FindMaxNumber(false);
        min.findMax(2, 0);
        min.findMax(10, 30);
        min.history();
    }

    //Constructor
    public FindMaxNumber(boolean max) {
        findMaxNum = max;
    }

    // find maximum number
    public int findMax(int d1, int d2) {

        // create array object
        var array = new int[]{d1, d2};

        // Add to History
        addToHistory(array);

        return innerFind(array);
    }

    // add to history
    private void addToHistory(int [] array) {
        var copy = new int[history.length + 1][2];

        // copy history
        for(var i = 0; i < history.length; i++) {
            copy[i] = history[i];
        }

        copy[copy.length -1] = array;
        history = copy;
    }

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
            System.out.printf("D1 = %d, D2 = %d, %s Value is %d.%n" ,
            data[0] , data[1] , findMaxNum ? "Max" : "Min" , innerFind(data));

            // System.out.println("D1 = %d, D2 = %d, Max Value is %d.%n" +
            // data[0] + data[1] + innerFind(data));
        }
    }
}
