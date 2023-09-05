package dk.cphbusiness.cphnw89.resources.threads.bankstuff;

public class BankAccount {

    private int balance;
    private String accountHolder;

    public BankAccount(String accountHolder, int initialBal){
        this.accountHolder = accountHolder;
        this.balance = initialBal;
    }

    public synchronized void withdraw(int i){
        if(balance >= i){
            balance -= i;
            System.out.println("Withdrew "+i+" amount of money by"+" "+accountHolder);
        }else {
            System.out.println("Insufficient funds on the account "+accountHolder);
        }
    }

    public synchronized void deposit(int i){
        this.balance += i;
        System.out.println("Deposited: "+i+" amount of money by "+ accountHolder);
    }

    public synchronized void transfer(int i, BankAccount target){
        target.setBalance(target.getBalance() + i);
        System.out.println(this.accountHolder+" Transferred "+i+" amount of money to "+ target.getAccountHolder());
    }

    public synchronized int getBalance(){
        return balance;
    }

    public synchronized void setBalance(int i){
        balance = i;
    }

    public synchronized String getAccountHolder(){
        return accountHolder;
    }
}
