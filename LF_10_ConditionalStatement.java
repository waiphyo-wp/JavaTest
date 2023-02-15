import java.util.Scanner;

public class LF_10_ConditionalStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int enterValueAge = sc.nextInt();
        System.out.println("Enter Age : " + enterValueAge);
        checkAge(enterValueAge);
    }

    static void checkAge(int age) {
        if (age < 0) {
            System.out.println("Your age wrong !!! plz enter again");
        } else if(age < 18) {
            System.out.println("You cann't accept");
        } else if(age >= 18 && age < 200){
            System.out.println("You can accept");
        }else {
            System.out.println("Your age is greate 200. It is not impossible . Plz Enter again");
        }
    }
}
