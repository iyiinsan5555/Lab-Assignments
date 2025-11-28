import java.util.Scanner;

public class BankAccount {
    private long accountID;
    private int balance;

    Scanner scanner = new Scanner(System.in);


    BankAccount(long accountID, int balance){
        this.accountID = accountID;
        this.balance = balance;
    }

    public void deposit(int depositAmount){
        if (depositAmount > 0) {
            this.balance += depositAmount;
            printBalance();
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(int withdrawAmount) {
        if (this.balance - withdrawAmount >= 0) { //person has enough money
            this.balance -= withdrawAmount;
        } else {
            System.out.print("Want to go into borrowing? (Y/N):  ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("y")){
                balance -= withdrawAmount;
            } else if (input.equalsIgnoreCase("n")) {
                System.out.println("“Insufficient balance!");
            } else {
                System.out.println("Invalid input type.");
            }

        }
        printBalance();
    }

    public void printBalance(){
        System.out.println("Balance: " + this.balance);
    }

    public void accountDetails(){
        printBalance();
        System.out.println("AccountId: " + this.accountID);
    }

    public long getAccountID(){
        return accountID;
    }

    public int getBalance(){
        return balance;
    }
}

