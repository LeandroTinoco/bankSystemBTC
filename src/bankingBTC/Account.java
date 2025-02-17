package bankingBTC;

public class Account {
    private String id;
    private String name;
    private double balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public void withdraw(double value){
        if(value <= this.balance) {
            balance = balance - value;
            System.out.println("WITHDRAW APPROVED: "+ value +" BTC  (" + this.name + ")");
        } else {
            System.out.println("INSUFFICIENT BALANCE");
        }
    }

    public void deposit(double value){
        if(value>0) {
            balance = balance + value;
        }else{
            System.out.println("INVALID DEPOSIT!");
        }
    }
    public void transfer(double value, Account destination) {
        if (value <= balance) {
            balance = balance - value;
            destination.deposit(value);
            System.out.println("TRANSACTION: " + value +" BTC  ("+ this.name + " -> " + destination.getName()+")");
        } else {
            System.out.println("INSUFFICIENT VALUE");
        }
    }
    public double getBalance() {
        System.out.println(this.name + " your account balance is: "+ this.balance + " BTC \n");
        return this.balance;
    }

    public String getName() {
        return name;
    }
}
