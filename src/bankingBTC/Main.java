package bankingBTC;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n===== SAVE IN BTC - BANKING SYSTEM ====");
        Account testUser = new Account("001" , "Leandro Mileski" );
        Account testUser2 = new Account("002" , "Christian Garcia" );

        testUser.deposit(100);
        testUser.getBalance();

        testUser.withdraw(10);
        testUser.getBalance();

        testUser.transfer(10,testUser2);

        testUser2.getBalance();
        testUser.getBalance();

        System.out.println("===== SYSTEM CLOSED =====");
    }
}
