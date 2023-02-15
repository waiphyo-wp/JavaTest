import java.util.Scanner;

public class LF_10_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = null;

        do {
            System.out.print("Enter day number : ");

            String day = sc.nextLine();
            int dayNumber = Integer.valueOf(day);// type cast
            switchDemo(dayNumber);

            System.out.println("Want To Exit : enter 'Y' ");
            str = sc.nextLine();

        } while (!"Y".equalsIgnoreCase(str));
    }

    // old switch
    /*
    *
    static void switchDemo(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;                
            default:
                System.out.println("Other Day");
                break;
        }
    }
     * 
     */

     // short hand switch (no need break , : => only used (->))
     static void switchDemo(int day) {
        String strDay = switch (day) {
            case 0 -> { // more than one line , can use code block {}
                System.out.println("Hello Sunday");
                yield "Sunday"; // yeild => return value
            }
            case 1 -> "Monday";// exactly one line , can work break and return value 
            default -> "Other Day";
        };

        System.out.println(strDay);
     }
}
