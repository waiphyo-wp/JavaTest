package BankingApplication;

import java.util.Scanner;

/**
 * 
    1. Welcome message to user
    2. deposit
    3. withdraw
    4. previous transactions
    5. show option
*/


public class BankingApplication {
     public static void main(String[] args) {
        BankAccount bankOne = new BankAccount("aung aung", "ID-0001");
        bankOne.showOption();
     }
    
}

class BankAccount {
    int balance;
    int previousTransaction;

    String customerName;
    String customerId;

    BankAccount(String cname, String cid) {
        customerName = cname;
        customerId = cid;
    }

    void deposit(int ammount) {
        if (ammount != 0) {
            balance = balance + ammount;
            previousTransaction = ammount;
        }
    }

    void withdraw(int ammount) {
        if (ammount != 0) {
            balance = balance - ammount;
            previousTransaction = -ammount;
        }
    }

    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        }else if (previousTransaction < 0) { // -50 = 50
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction is occured");
        }
    }

    void showOption() {
        char option = '\0';
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome " + customerName);
        System.out.println("Your ID is: "+ customerId);
        System.out.println();
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        
        do {
            System.out.println("============================");
            System.out.println("Enter the option");
            System.out.println("============================");
            option = Character.toUpperCase(sc.next().charAt(0));
            
            switch (option) {
                case 'A':
                    System.out.println("============================");
                    System.out.println("Balance is: " + balance);
                    System.out.println("============================");
                    System.out.println();
                    break;

                case 'B':
                    System.out.println("============================");
                    System.out.println("Enter the ammount to deposit");
                    System.out.println("============================");
                    int ammount = sc.nextInt();
                    //call deposit method
                    deposit(ammount);
                    System.out.println();
                    break;

                case 'C':
                    System.out.println("============================");
                    System.out.println("Enter the ammount to withdraw");
                    System.out.println("============================");
                    int ammount2 = sc.nextInt();
                    //call withdraw method
                    withdraw(ammount2);
                    System.out.println();
                    break;

                case 'D':
                    System.out.println("============================");
                    //call getPreviousTransaction method
                    getPreviousTransaction();
                    System.out.println("============================");
                    System.out.println();
                    break;

                case 'E':
                    System.out.println("============================");
                    break;

                default:
                    System.out.println("Invalid Option! Please try again");
                    break;
            }
        } while (option != 'E');
    }

}
