/*
 * 1 . Write a program, fristly create method that received two arg, give max number.
 */

public class MethodPractice {
    public static void main(String[] args) {
        int result = calMaxNumber(15, 10);
        var name = "1234";
        System.out.println("Max Number : " + result);

        System.out.println(name.getClass().getSimpleName());
    }

    static int calMaxNumber(int num1, int num2) {
        int maxNum = Math.max(num1, num2);
        return maxNum;
    }
}

