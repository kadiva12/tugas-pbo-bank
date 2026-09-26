public class Bank {
    // Attributes for customers
    private Customer[] customers;
    private int numberOfCustomers;

    // Attribute for account balance
    private double balance;

    // Default constructor: no initial balance, just sets up the customers array
    public Bank() {
        customers = new Customer[100]; // maximum size, bigger than 5
        numberOfCustomers = 0;
        balance = 0;
    }

    // Overloaded constructor: sets initial balance, and also sets up the customers array
    public Bank(double balance) {
        customers = new Customer[100];
        numberOfCustomers = 0;
        this.balance = balance;
    }

    // ----- Customer-related methods -----

    // Constructs a new Customer from first/last name and adds it to the array
    public void addCustomer(String firstName, String lastName) {
        Customer newCustomer = new Customer(firstName, lastName);
        customers[numberOfCustomers] = newCustomer;
        numberOfCustomers++;
    }

    // Accessor method: returns the numberOfCustomers attribute
    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    // Returns the customer associated with the given index
    public Customer getCustomer(int index) {
        return customers[index];
    }

    // ----- Balance-related methods -----

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit: Rp " + (long) amount);
        System.out.println("Current balance: Rp " + (long) balance);
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Withdraw failed: insufficient balance.");
            return;
        }
        balance -= amount;
        System.out.println("Withdraw: Rp " + (long) amount);
        System.out.println("Current balance: Rp " + (long) balance);
    }

    // Getter method
    public double getBalance() {
        return balance;
    }

    // Setter method
    public void setBalance(double balance) {
        this.balance = balance;
    }
}