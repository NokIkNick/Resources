package dk.cphbusiness.cphnw89.datastructures.threads.bankstuff;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BankAccountSimulation {

    public static void main(String[] args) {
        /*BankAccount account = new BankAccount("Dude man", 1000);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Transaction withdrawal = new Transaction(account, TransactionType.WITHDRAWAL, 100);
        Transaction deposit = new Transaction(account, TransactionType.DEPOSIT, 1000);

        executorService.submit(withdrawal);
        executorService.submit(deposit);

        executorService.shutdown();

        try{
            executorService.awaitTermination(5, TimeUnit.SECONDS);
        }catch(InterruptedException e){

        }
        System.out.println("Final Account Balance: "+ account.getBalance());*/
        BankAccount[] bankAccounts = new BankAccount[4];
        Random random = new Random();
        for(int i = 0; i< bankAccounts.length-1; i++){
            bankAccounts[i] = new BankAccount("BankAccount: "+i, random.nextInt(1000,2000));
        }
        ExecutorService executorService = Executors.newFixedThreadPool(4);


    }





}
