package dk.cphbusiness.cphnw89.datastructures.threads.coffeeShop;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop();

        ExecutorService customerExecutor = Executors.newFixedThreadPool(3); //Limit the amount of threads working on the task.
        ExecutorService baristaExecutor = Executors.newFixedThreadPool(2);

        for(int i = 0; i < 3; i++){
            customerExecutor.execute(new Customer(coffeeShop, "Customer " + (i +1))); //Execute the customer tasks
        }

        for(int i = 0; i < 2; i++){
            baristaExecutor.execute(new Barista(coffeeShop, "Barista " + (i +1))); //Execute the barista tasks
        }

        customerExecutor.shutdown(); //Shuts down the threads and tasks. Waits for the tasks to be done before shutting down.
        baristaExecutor.shutdown();

        try{
            customerExecutor.awaitTermination(10, TimeUnit.SECONDS); //Shuts down the tasks after shutdown is called or the timeout runs out.
            baristaExecutor.awaitTermination(10, TimeUnit.SECONDS);
        }catch(InterruptedException e){
            System.out.println(":(");
        }
    }
}
