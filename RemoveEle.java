public class RemoveEle {

    public static String name = "aung aung";

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{1,2,3,4,5,6}, 4));
        new DoSome().doSome();
    }
    
    public static int[] removeElement(int [] array, int element) {

        String num;

        // {1,2,3,4,5} , 3 => {4,5}
        var result = new int[array.length - element];

        for (int i = 0; i < result.length; i++) {
            result[i] = array[i + element];
        }

        return result;
    }

}

class DoSome extends RemoveEle {
    public void doSome() {
        System.out.println(name);
    }
}
