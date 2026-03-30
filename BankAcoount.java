
public class BankAcoount {
    private double Balance;
    private String AcoountHolder;


    public BankAcoount(double initialBalance, String HolderName){
        if(initialBalance >=0){
           
            this.AcoountHolder=HolderName;

            if (initialBalance >= 0){
                 this.Balance=initialBalance;
            }else{
                System.out.println("Error: Initial Balance cannot be Nagative. Setting to 0");
                this.Balance=0;
            }
        }
    }

    public double getBalance(){
        return Balance;
    }

    public String getAccountHolder() {
        return AcoountHolder;
    }

    public void deposit(double amount){
        if (amount >0){
            Balance += amount;
        }else{
            System.out.println("Invalid deposit amount");
        }
    }


    public void Withdraw(double amount){
        if (amount >0 && amount <= Balance){
            Balance -= amount;
            System.out.println("Withdraw amount: "+ amount);
        }else{
            System.out.println("Transaction Failed. Invalid amount.");
        }
    }

    public void displayDetail(){
     System.out.println("-------------------------");
    System.out.println("Holder: "+ AcoountHolder);
    System.out.println("Current Balance: "+ Balance);
     System.out.println("-------------------------");
    }
}
