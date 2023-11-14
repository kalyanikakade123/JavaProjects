import java.util.*;

public class BankAccount {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount("Kalyani", "3456670");
        user1.showMenu();
    }



    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String name, String ID) {
        this.customerName = name;
        this.customerId = ID;
    }

    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = +amount;
        }
    }

    void withdraw(int amount) {
        if (amount != 0 && balance > amount) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        }
        else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        }
        else {
            System.out.println("No Transaction occured");
        }
    }

    void showMenu() {
        char option = 'a';
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome " + customerName + "!");
        System.out.println("Your ID is " + customerId);
        System.out.println();
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. withdraw");
        System.out.println("D. Previous transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("**********************");
            System.out.println();
            System.out.print("Enter an option : ");
            option = in.next().charAt(0);
            System.out.println();

            switch(option) {

                case 'A':
                    System.out.println("Balance = " + balance);
                    System.out.println();
                    break;

                case 'B':
                    System.out.print("Enter the amount to deposit : ");
                    int amount = in.nextInt();
                    deposit(amount);
                    System.out.println();
                    System.out.println("Amount deposited Successfully!");
                    System.out.println();
                    System.out.println("Available balance :" + balance);
                    System.out.println();
                    break;

                case 'C':
                    System.out.print("Enter the amount to withdraw : ");
                    int amount2 = in.nextInt();
                    withdraw(amount2);
                    System.out.println("Amount withdrawn Successfully!");
                    System.out.println();
                    System.out.println("Available balance :" + balance);
                    System.out.println();
                    break;

                case 'D':
                    getPreviousTransaction();
                    System.out.println();
                    break;

                case 'E':
                    break;

                default :
                    System.out.println("Invaid Option! Please enter again");
                    break;
            }
        }while (option != 'E');

        System.out.println("Thankyou for using our services");
    }
}
