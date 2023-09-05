package dk.cphbusiness.cphnw89.resources.threads.coffeeShop;

public class Customer implements Runnable{
    private CoffeeShop coffeeShop;
    private String customerName;

    public Customer(CoffeeShop coffeeShop, String customerName){
        this.coffeeShop = coffeeShop;
        this.customerName = customerName;
    }
    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted()){
            try{
                int randomDelay = (int) (Math.random() * 5000); //Random order placement delay
                Thread.sleep(randomDelay);
                String coffeeType = getRandomCoffeeType();
                CoffeeOrder order = new CoffeeOrder(customerName, coffeeType);
                coffeeShop.placeOrder(order);
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }

    private String getRandomCoffeeType(){
        String[] coffeeTypes = {"Espresso", "Latte", "Cappuccino", "Mocha", "Americano"};
        int randomIndex = (int) (Math.random() * coffeeTypes.length);
        return coffeeTypes[randomIndex];
    }

}
