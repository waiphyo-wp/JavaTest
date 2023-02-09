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