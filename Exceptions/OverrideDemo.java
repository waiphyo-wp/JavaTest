package Exceptions;

public class OverrideDemo {
    public static void main(String[] args) {
        test(new SuperClass());
        
        test(new SubClass());

        
    }


    static void test(SuperClass s) {
        try {
            s.doSomething();
        } catch (NullPointerException e) {
           
            System.out.println("NullPointerException Handled From Test method");
        } catch(MyException2 | MyException e) {
            System.out.println("Exception Handled form Test method");
        }catch(Exception e) {
            System.out.println("Simple Exception");
        }finally {
            System.out.println("Finally Here");
        }
    }

}

class SuperClass {

    void doSomething() throws Exception {
        System.out.println("SuperClass");
        // try {
            
            // } catch (Exception e) {
                //     // TODO: handle exception
                // }
                throw new MyException(); // must throws checkException these method
            }


}

class SubClass extends SuperClass {

    @Override
    void doSomething() throws MyException2 {
        System.out.println("SubClass");
        throw new MyException2();
    }
}

class MyException extends Exception {}

class MyException2 extends Exception {}
