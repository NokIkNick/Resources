package dk.cphbusiness.cphnw89.resources.threads.coffeeShop;

import java.util.concurrent.ArrayBlockingQueue;

public class CoffeeShop {
    private ArrayBlockingQueue<CoffeeOrder> orders;

    public CoffeeShop(){
        this.orders = new ArrayBlockingQueue<>(10); //Limited order queue size
    }

    public void placeOrder(CoffeeOrder order){
        try{
            orders.put(order);
            System.out.println(order.getCustomerName() + " placed an order for "+ order.getCoffeeType());
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    public CoffeeOrder fulfillOrder(){
        try{
            CoffeeOrder order = orders.take();
            System.out.println("Barista is preparing "+ order.getCoffeeType()+ " for "+order.getCustomerName());
            return order;
        } catch(InterruptedException e){
            Thread.currentThread().interrupt();
            return null;
        }
    }
}
