public class LF_07_Method_Arg {
    public static void main(String[] args) {
       //primitive data type
    //    int val = 10; 
    //    System.out.println(val); //10

       //call doSomething method
    //    doSomething(val); //20

       //call primitive data value
    //    System.out.println(val); //10

        //reference data type
        Value val = new Value();
        val.val = 10;

        System.out.println(val.val); //10

        doSomething(val);

        System.out.println(val.val); //20
    }

    //method with primitive type arg
    /*
    public static void doSomething(int param) {
        int res = param * 2;
        System.out.println(res);
    }
    */

    //method with reference type arg
    public static void doSomething(Value param) {
        param.val = param.val * 2;
        System.out.println(param.val); //20
    }
}

class Value {
    int val; //20
}