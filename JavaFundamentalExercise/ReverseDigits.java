package JavaFundamentalExercise;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {

        /**
         Take the number's modulo by 10.
         Multiply the reverse number by 10 and add modulo value into the reverse number.
         Divide the number by 10.
         Repeat above steps until number becomes zero.
         **/  
        
         Scanner sc = new Scanner(System.in);
         int inputNumber = sc.nextInt();

         int reverseNumber = 0;

         int remainder = 0;

        while (inputNumber != 0) {
            remainder = inputNumber % 10; //6
            reverseNumber = (reverseNumber * 10) + remainder; // 6
            inputNumber /= 10; // 12345
            // System.out.println(inputNumber);
        }

        System.out.println(reverseNumber);

    }
}
