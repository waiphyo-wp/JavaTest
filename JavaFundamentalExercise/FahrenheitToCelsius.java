package JavaFundamentalExercise;

import java.util.Scanner;

public class FahrenheitToCelsius {
    
    
    public static void main(String[] args) {
        
        System.out.println("===== Start Temperature Change Program =====");
        
        Scanner sc = new Scanner(System.in);

        String programStatus = null;

        do {

            temperatureManagement();

            System.out.print("Do you want to start Program : 'Y/N' - ");
            programStatus = sc.nextLine();
            
        } while (!"Y".equalsIgnoreCase(programStatus)); // program control
    }   
    
    private static void temperatureManagement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("State Change F to C : type 'true' / C to F : type 'false' - ");
        //state change variable
        boolean fahrenheitToCelsius = sc.nextBoolean();

        if (fahrenheitToCelsius) {
            System.out.print("Enter Degree in Fahrenheit : ");
            double degreeInFahrenheit = sc.nextDouble();
            System.out.println("Result : " + convertFahrenheitToCelsius(degreeInFahrenheit) + "'C");
        } else {
            System.out.print("Enter Degree in Celsius : ");
            double degreeInCelsius = sc.nextDouble();
            System.out.println("Result : " + convertCelsiusToFahrenheit(degreeInCelsius) + "'F");
        }
    } 

    //convertFahrenheitToCelsius
    private static double convertFahrenheitToCelsius(double degreeInFahrenheit) {
        double result = ( degreeInFahrenheit - 32 ) * 0.5556;
        return result;
    }

    //convertCelsiusToFahrenheit
    private static double convertCelsiusToFahrenheit(double degreeInCelsius) {
        double result = (degreeInCelsius * 1.8) + 32;
        return result;
    }

}
