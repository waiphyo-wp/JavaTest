package Exceptions;

public class CheckException {

    private static int count;
    public static void main(String[] args) {
        var methods = CheckException.class.getDeclaredMethods();// return array

        for (var method : methods) {
            
            System.out.println(method.getName());
        }

        doBusiness();

    }


    static void doBusiness() {
        System.out.println("This is Business");

        try {
            sayHello();
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception handling from doBusiness");
        }

    }

    static void sayHello() throws Exception {
        // var str = new StringBuilder("radical").insert(str.length(), "robots")

        
        if (count <= 0) {
            throw new Exception();
        }

        System.out.println("Say Hello");

    }

}