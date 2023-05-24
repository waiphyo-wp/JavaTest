package LambdaExpression;

public class LambdaExpression {
    public static void main(String[] args) {
        // before lambda
        TwoArgument two = new TwoArgument() {
            @Override
            public int addNum(int num1, int num2) {
                return num1+num2;
            }
        };

        System.out.println("Before Lamda : " + two.addNum(10, 20));

        // after lambda
        TwoArgument twoArgByLambda = (num1, num2) -> num1 + num2;
        System.out.println( "After Lambda : " + twoArgByLambda.addNum(30, 40));
    }
}

interface TwoArgument {
    int addNum(int num1, int num2);
}