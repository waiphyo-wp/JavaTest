public class LF_02_Method_Call_Calculator {
    public static void main(String[] args) {
        // call other class file 
        // call static method
        int res = LF_02_Method_Calculator.add(10,5);
        System.out.println(res);

        // call instant method
        LF_02_Method_Calculator callCalculator = new LF_02_Method_Calculator();
        res = callCalculator.divide(10, 5);
        System.out.println(res);

        // System.out.println(args[1]);
        
        int num = 2;
        String name = "mama";
        boolean checkAge = 20>10;

        num = 10;
        name = "kgkg";
        checkAge = 10>20;

        System.out.println(num);
        System.out.println(name);
        System.out.println(checkAge);
    }

}

class Variable {
    int count = 5;
    void doSomething() {
        int count = 10;
        System.out.println(count);
        System.out.println(this.count);
    }    
}