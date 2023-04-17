package Exceptions;

public class ErrorDemo {
    public static void main(String[] args) {
        System.out.println("Main start ...");

        try {
            makeError(0);
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception catch From Main method");
        }catch(StackOverflowError s) {
            System.out.println("StackOverflowError Catch in From Main");
        }catch(Error s) {
            System.out.println("Error Catch in From Main");
        }finally {
            
        }


        System.out.println("Main End ...");

    }

    static void makeError(int count) {
        System.out.println("Count : " + ++count);

        makeError(count);
    }
}