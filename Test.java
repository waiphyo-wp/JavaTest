public class Test {
    
    public static void main(String[] args) {
        Test test = new Test();
        test.hello( new String []{"Mg Mg", "I'm Student."});
        // System.out.println(test.add(test.add(20, 30), 50)); 

        System.out.println(Hello.add(10,2));

        Hello res = new Hello();
        int result = res.sub(10, 5);
        System.out.println(result);
    }

    // method overloading
    void hello(String ...name) {
        for (String string : name) {
            System.out.println(string);
        }
    }

    void hello(String fname, String ...name) {
        System.out.println("Count : " + fname + " String : " + name);

        for (String string : name) {
            System.out.println(string);
        }
    }

    // int add(int a, int b) {
    //     return a+b;
    // }
}

class Hello {

    // static method
    static int add(int a, int b) {
        return a + b;
    }

    // instance method
    int sub(int a, int b) {
        return a-b;
    }

    // use Enum value in Switch
    void doJob(Operation operation) {
        switch (operation) {
            case ADD_STUDENT:
                System.out.println("Add STD");
                break;
            case GET_STUDENT:
                System.out.println("Add STD");
                break;
            case ADD_RESULT:
                System.out.println("Add STD");
                break;
            case GET_RESULT:
                System.out.println("Add STD");
                break;
        
            default:
                break;
        }
    }


    // 1 > Create Enum
    enum Operation {
        ADD_STUDENT,
        GET_STUDENT,
        ADD_RESULT,
        GET_RESULT;

        static Operation getOperation(String str) {
            var id = Integer.parseInt(str);
            return values()[id-1];
        }
    }



}


