package dk.cphbusiness.cphnw89.resources.threads.bankstuff;

public class Transaction implements Runnable{

    private BankAccount account;
    private TransactionType type;
    private int amount;
    private BankAccount target;
    public Transaction(BankAccount account, TransactionType type, int amount){
        this.account = account;
        this.type = type;
        this.amount = amount;
    }

    public Transaction(BankAccount account, TransactionType type, int amount, BankAccount target){
        this.account = account;
        this.type = type;
        this.amount = amount;
        this.target = target;
    }

    @Override
    public void run() {
        switch (type){
            case DEPOSIT -> {account.deposit(amount);}
            case TRANSFER -> {account.transfer(amount, target);}
            case WITHDRAWAL -> {account.withdraw(amount);}
        }

    }
}
