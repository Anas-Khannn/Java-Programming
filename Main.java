import java.util.Scanner;


    public class Main {
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
                    account.withdrawAmount();
                } else if (choice == 4) {
                    break;
                } else {
                    System.out.println("Invalid choice");
                }
            }
            scanner.close();
        }
    }

}
