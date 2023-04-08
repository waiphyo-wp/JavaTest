import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class LF_10_Whlie_DoWhile {
    public static void main(String[] args) {
        //While loop
        /*
         * while(condition) {
         *  statement;
         * }
         */
        
        //create generate random number 1 - 5s
        System.out.println("====Guess Number====");

        Scanner sc = new Scanner(System.in);

        //1. initialize
        Boolean same = false;

        //2. decision
        // while (!same) {
        //     System.out.print("Enter Guess Number between 1 - 5 ");
        //     //guess number
        //     int guessNum = sc.nextInt();

        //     //generated random number
        //     int randomNum = ThreadLocalRandom.current().nextInt(1, 5);
        //     System.out.println("Generate Random Number : " + randomNum);

        //     //end of loop code or exit loop code
        //     same = guessNum == randomNum; // return true or false
        //     System.out.println("same or not : " + same);
        //     //condition
        //     String result = same ? "Guess number Correct !!!" : "Guess Number Incorrect";

        //     System.out.println(result);
        // }

        // do while loop => alease work once
        // do {
        //     System.out.print("Enter Guess Number between 1 - 5 ");
        //     //guess number
        //     int guessNum = sc.nextInt();

        //     //generated random number
        //     int randomNum = ThreadLocalRandom.current().nextInt(1, 5);
        //     System.out.println("Generate Random Number : " + randomNum);

        //     //end of loop code or exit loop code
        //     same = guessNum == randomNum; // return true or false

        //     //condition
        //     String result = same ? "Guess number Correct !!!" : "Guess Number Incorrect";

        //     System.out.println(result);
        // } while(!same);

        int num = 10;
        do {
            num --;
            System.out.println("hello : " + num );
            // System.out.println(num);
        } while (num > 0);
    }
}
