import java.util.Scanner;
public class methodOverload {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0.000;
        int choice;
        boolean isrunning = true;


        while (isrunning) {

            System.out.println("     Banking Program     ");
            System.out.println();
            System.out.println("1. check your balance");
            System.out.println("2. deposit");
            System.out.println("3. withdraw");
            System.out.println("4. Exit");
            System.out.println();


            System.out.print("Enter Your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdrawl(balance);
                case 4 -> isrunning = false;

                default -> System.out.println("Invalid choice");
            }
        }
        scanner.close();
    }


    static void showBalance(double balance) {
        System.out.printf("Your Balance is %.2f \n \n", balance);
    }

    static double deposit() {
        double amt;
        System.out.print("Enter amt u wanted to deposit: ");
        amt = scanner.nextDouble();
        if (amt < 0) {
            System.out.print("Amount cannot be negative");
            return 0;
        } else {
            return amt;
        }

    }

    static double withdrawl(double balance) {
        double amount;

        System.out.print("Enter amt u wanted to Withdraw: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.print("INSUFFICIENT BALANCE");
            return 0;
        } else if (amount < 0) {
            System.out.print("Amount cannot be Negative");
            return 0;
        }
        else {
            return amount;
        }
    }
}
