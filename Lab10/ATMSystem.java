import java.util.InputMismatchException;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account(500.00);
        
        System.out.println("=== SECURE ATM SYSTEM ===");
        System.out.println("Your balance: " + account.getBalance());
        
        try {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            account.withdraw(amount);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid numerical value.");
            scanner.next(); // Clear invalid input
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction Session Ended");
        }
        
        scanner.close();
    }
}