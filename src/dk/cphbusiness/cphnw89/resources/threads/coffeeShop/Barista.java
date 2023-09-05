package dk.cphbusiness.cphnw89.resources.threads.coffeeShop;

public class Barista implements Runnable{
    private CoffeeShop coffeeShop;
    private String baristaName;

    public Barista(CoffeeShop coffeeShop, String baristaName){
        this.coffeeShop = coffeeShop;
        this.baristaName = baristaName;
    }
    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted()){
            try{
                int randomDelay = (int) (Math.random() * 5000);
                Thread.sleep(randomDelay);
                CoffeeOrder order = coffeeShop.fulfillOrder();
                if(order != null){
                    System.out.println(baristaName+" served "+ order.getCoffeeType()+ " for "+ order.getCustomerName());
                }
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}
