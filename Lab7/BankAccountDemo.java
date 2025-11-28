import java.util.Scanner;

public class BankAccountDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        BankAccount account1 = new BankAccount(1241, 100);

        while (isRunning) {
            System.out.println("Enter 1 to deposit, 2 to withdraw, 3 to account details, 4 to exit");
            int userInput = scanner.nextInt();

            if (userInput == 1) {
                System.out.println("Enter your deposit amount: ");
                int depositAmount = scanner.nextInt();
                account1.deposit(depositAmount);
            } else if (userInput == 2) {
                System.out.println("Enter your withdraw amount: ");
                int withdrawAmount = scanner.nextInt();
                account1.withdraw(withdrawAmount);
            } else if (userInput == 3) {
                account1.accountDetails();
            } else if (userInput == 4) {
                isRunning = false;
                System.out.println("Final account info:");
                account1.accountDetails();
                break;
            }
        }

        //To demonstrate account2
        BankAccount account2 = new BankAccount(33321, 0);
        account2.accountDetails();
        account2.deposit(50);
        account2.accountDetails();

    }
}
