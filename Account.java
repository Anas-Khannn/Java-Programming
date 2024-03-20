import java.util.Scanner;

public class Account {
    private String name;
    private int balance;

    public void depositAmount(int amount) {
        System.out.println("Updated Balance: " + (balance + amount));
        this.balance += amount;
    }

    public void withdrawAmount(int amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter withdraw amount: ");
        if (scanner.hasNextInt()) {
            amount = scanner.nextInt();
            if (amount <= balance) {
                this.balance -= amount;
                System.out.println("Balance: " + this.balance);
            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer amount.");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void print() {
        System.out.println("Balance = " + balance);
        System.out.println("Name = " + name);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice, amount;
        Account account = new Account();
        account.setBalance(100000);
        account.setName("Anas Khan");

        while (true) {
            System.out.println("\n1: Display Balance");
            System.out.println("2: Deposit amount");
            System.out.println("3: Withdraw amount");
            System.out.println("4: Exit");
            System.out.print("Press: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                account.print();
            } else if (choice == 2) {
                System.out.print("How much amount you want to deposit: ");
                amount = scanner.nextInt();
                account.depositAmount(amount);
            } else if (choice == 3) {
                System.out.print("Enter withdraw amount: ");
                amount = scanner.nextInt();
                account.withdrawAmount(amount);
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}