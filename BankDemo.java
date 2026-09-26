public class BankDemo {
    public static void main(String[] args) {
        // Set initial balance via the constructor
        Bank account = new Bank(100000);

        System.out.println("Welcome to Bank ABC");
        System.out.println("Current balance: Rp " + (long) account.getBalance());
        System.out.println();

        // Run deposit()
        account.deposit(500000);
        System.out.println();

        // Run withdraw()
        account.withdraw(150000);
    }
}