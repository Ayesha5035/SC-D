public class Account {
    private double balance;
    
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Error: You cannot withdraw a negative or zero amount.");
        }
        
        if (amount > balance) {
            throw new InsufficientFundsException("Error: Insufficient funds! Your balance is " + balance);
        }
        
        balance -= amount;
        System.out.println("Successfully withdrew: " + amount);
        System.out.println("New balance: " + balance);
    }
    
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Error: You cannot deposit a negative or zero amount.");
        }
        
        balance += amount;
        System.out.println("Successfully deposited: " + amount);
        System.out.println("New balance: " + balance);
    }
}