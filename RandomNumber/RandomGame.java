package RandomNumber;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomGame {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Guess Random Number");
        System.out.println();
        
        String status = null;
        
        do {
            
            System.out.print("Enter Guess Value : ");
            int guessVal = sc.nextInt();
    
            int randomVal = ThreadLocalRandom.current().nextInt(1, 3);
            System.out.println("Random Generate Val : " + randomVal );


            if (guessVal == randomVal) {
                System.out.println("You Win !!!");
            }else {
                System.out.println("You Lose !!!");
            }

            System.out.print("Exit Or Not => Exit(Y) / N : ");
            status = sc.next();
        } while (!"Yes".equalsIgnoreCase(status));
        
    }
}
