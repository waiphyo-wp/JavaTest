package JavaFundamentalExercise;

import java.util.Scanner;

public class MulitiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Positive Integer : ");
        int postiveInteger = sc.nextInt();

        int result = 0;

        for (int i = 0; i < 13; i++) {
            result = postiveInteger*i;
            System.out.println(postiveInteger + " X "+ i + " = " + result );
        }
    }
}
