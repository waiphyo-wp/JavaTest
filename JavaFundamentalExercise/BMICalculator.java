package JavaFundamentalExercise;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Weight in Pound : ");
        double inputWeightInPound = sc.nextDouble();

        System.out.print("Enter Height Inches : ");
        double inputHeightInInches = sc.nextDouble();

        //BMI formula
        double bmiCalculation = (inputWeightInPound / (inputHeightInInches * inputHeightInInches)) * 703;

        System.out.println("Body Max Index is " + bmiCalculation);

    }
}
