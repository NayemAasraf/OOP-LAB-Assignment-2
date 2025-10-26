public class Main {
    public static void main(String[] args) {
        
        BankAccount account1 = new BankAccount();

        account1.setAccountNumber("SB-12345");
        account1.setBalance(5000.75);

        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Balance: $" + account1.getBalance());
        
        account1.setBalance(-150);
        
        System.out.println("Current Balance: $" + account1.getBalance());
    }
}