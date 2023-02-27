package JavaFundamentalExercise;

import java.util.Scanner;

public class MathCalculation {

    private static int inputTimes[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstDigit = sc.nextInt();
        int secondDigit = sc.nextInt();

        System.out.println("Sum of two digit : "+ sumTwoDigit(firstDigit,secondDigit));
        System.out.println("Difference of two digit : "+ differenceTwoDigit(firstDigit,secondDigit));
        System.out.println("Product of two digit : "+ productTwoDigit(firstDigit,secondDigit));
        System.out.println("Average of two digit : "+ averageTwoDigit(firstDigit,secondDigit));
        System.out.println("Distance of two digit : "+ distanceTwoDigit(firstDigit,secondDigit));
        System.out.println("Distance of two digit : "+ maxDigit(firstDigit,secondDigit));
        System.out.println("Distance of two digit : "+ minDigit(firstDigit,secondDigit));


    }

    //sumTwoDigit
    private static int sumTwoDigit(int firstDigit, int secondDigit) {
        return firstDigit + secondDigit;
    }

    // differenceTwoDigit
    private static int differenceTwoDigit(int firstDigit, int secondDigit) {
        return firstDigit-secondDigit;
    }

    // productTwoDigit
    private static int productTwoDigit(int firstDigit, int secondDigit) {
        return firstDigit*secondDigit;
    }

    // Average of Two digit
    private static float averageTwoDigit(int firstDigit, int secondDigit) {
        return (firstDigit+secondDigit)/2;
    }

    // distanceTwoDigit
    private static int distanceTwoDigit(int firstDigit, int secondDigit) {
        if (firstDigit > secondDigit) {
            return firstDigit-secondDigit;
        } else {
            return secondDigit-firstDigit;
        }
    }

    // max digit 
    private static int maxDigit(int firstDigit, int secondDigit) {
        return firstDigit > secondDigit ? firstDigit: secondDigit;
    }

    // min digit 
    private static int minDigit(int firstDigit, int secondDigit) {
        return firstDigit < secondDigit ? firstDigit: secondDigit;
    }
}
