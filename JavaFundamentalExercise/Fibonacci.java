package JavaFundamentalExercise;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();

        int firstNum = 0, secondNum = 1, thirdNum;

        // System.out.print(firstNum + " " + secondNum + " ");

        for (int i = 3; i <= inputNum; i++) {
            
            thirdNum = firstNum+secondNum;
            System.out.print(thirdNum + " ");
            firstNum = secondNum;
            secondNum = thirdNum;

        }

    }
}
