package JavaFundamentalExercise;

import java.util.Scanner;

public class MinuteToYearsAndDays {
    public static void main(String[] args) {
        //user input
        Scanner sc = new Scanner(System.in);
        int inputMinutes = sc.nextInt();
        
        System.out.println(minutesToYears(inputMinutes) + " years and " + minutesToDays(inputMinutes) + " days");
    }

    // change minutes to years and days
    private static int minutesToYears(int inputMinutes) {
        int result = inputMinutes / 525600; //get years
        return result;
    }

    private static int minutesToDays(int inputMinutes) {
        int remainMin = inputMinutes % 525600;
        int result = remainMin / 1440;
        return result;
    }
}
