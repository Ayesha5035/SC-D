public class MainBank{
       public static void main(String[]args){
        
       BankAcoount account1= new BankAcoount(0.0,"Abeera");
       BankAcoount account2= new BankAcoount(1000,"Ayesha");
  
  account2.deposit(500);
   account2.Withdraw(200);

   account2.displayDetail();

   account1.deposit(-500);
   account1.Withdraw(200);


   System.out.println("Final Detail : "+ account1.getAccountHolder() + " " + account1.getBalance());
   System.out.println("Final Detail : "+ account2.getAccountHolder() + " " + account2.getBalance());
}
}


