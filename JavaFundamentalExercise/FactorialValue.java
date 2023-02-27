package JavaFundamentalExercise;

import java.util.Scanner;

public class FactorialValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputNumber = sc.nextInt();

        //5
        //5-1=4
        //5-2=3
        //5-3=2
        //5-4=1
        int result = 1;
        for (int i = 1; i <= inputNumber; i++) {
            result *= i;
        }

        System.out.println("Factorial Val : " + result);

    }
}
