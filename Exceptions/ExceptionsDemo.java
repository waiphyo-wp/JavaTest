package Exceptions;

public class ExceptionsDemo {
    public static void main(String[] args) {
        System.out.println("Start Main Method");

        try {
            method1();
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Exception catch on Main method");
        }
        System.out.println("End Main Method");
    }

    static void method1() {
        System.out.println("Method One");
        method2();
        System.out.println("Method One End");
    }

    static void method2() {
        System.out.println("Method Two");
        method3();
        System.out.println("Method Two End");
    }

    static void method3() {
        System.out.println("Method Three");
        method4();
        System.out.println("Method Three End");
    }

    static void method4() {
        System.out.println("Method Four");
        
        try {
            int num = 10 /0;
        } catch (ArithmeticException e) { // errors skip by errors catching
            // TODO: handle exception
            System.out.println("Excetption catch on Method four");
        }


        System.out.println("Method Four End");
    }
}
