package Exceptions;

public class TestException {
    public static void main(String args[]) throws Exception {
        var g = new Gardern(5);
        // var h = new Gardern(4);
        try(
        g; 
        var h =new Gardern(4);
        var i = new Gardern(2)) {

        }finally {
            System.out.println(9);
        }
        g = null;
    }
}

class Gardern implements AutoCloseable {
    private final int g;

    Gardern(int g) {this.g = g;}

    public void close() throws Exception {
        System.out.println(g);
    }
}
