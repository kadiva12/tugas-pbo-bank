import java.util.Scanner;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many customers do you want to add? ");
        int total = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        for (int i = 0; i < total; i++) {
            System.out.print("Enter first name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter last name: ");
            String lastName = scanner.nextLine();

            bank.addCustomer(firstName, lastName);
        }

        System.out.println();
        System.out.println("Number of customers: " + bank.getNumOfCustomers());

        for (int i = 0; i < bank.getNumOfCustomers(); i++) {
            System.out.println("Customer " + i + ": " + bank.getCustomer(i));
        }

        scanner.close();
    }
}
