package dk.cphbusiness.cphnw89.datastructures.threads.coffeeShop;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop();

        ExecutorService customerExecutor = Executors.newFixedThreadPool(3);
        ExecutorService baristaExecutor = Executors.newFixedThreadPool(2);

        for(int i = 0; i < 3; i++){
            customerExecutor.execute(new Customer(coffeeShop, "Customer " + (i +1)));
        }

        for(int i = 0; i < 2; i++){
            baristaExecutor.execute(new Barista(coffeeShop, "Barista " + (i +1)));
        }

        customerExecutor.shutdown();
        baristaExecutor.shutdown();

        try{
            customerExecutor.awaitTermination(10, TimeUnit.SECONDS);
            baristaExecutor.awaitTermination(10, TimeUnit.SECONDS);
        }catch(InterruptedException e){
            System.out.println(":(");
        }
    }
}
