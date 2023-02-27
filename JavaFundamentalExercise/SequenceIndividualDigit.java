package JavaFundamentalExercise;

import java.util.Scanner;

public class SequenceIndividualDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputSixDigit = sc.nextInt();

        int num1 = inputSixDigit/100000;
        int num2 = (inputSixDigit/10000)%10;

        int num3 = (inputSixDigit/1000)%10;
        int num4 = (inputSixDigit/100)%10;
        int num5 = (inputSixDigit/10)%10;
        int num6 = (inputSixDigit/1)%10;

        System.out.println(num1+ " "+ num2+ " "+ num3+ " "+ num4+ " "+num5+ " " + num6);
    }
}
