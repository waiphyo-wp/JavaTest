package emplyee_registry.utils;

import java.util.Scanner;

public class UserInput {
    private static Scanner scanner;

    static{
        scanner = new Scanner(System.in);
    }

    public static String readString(String message) {
        System.out.printf("-16s : " + message);
        return scanner.nextLine();
    }

    public static int readInt(String message) {
        var string = readString(message);
        return Integer.parseInt(string);
    }
}
