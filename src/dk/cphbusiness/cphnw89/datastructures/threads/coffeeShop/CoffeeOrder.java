package dk.cphbusiness.cphnw89.datastructures.threads.coffeeShop;

public class CoffeeOrder {
    private String customerName;
    private String coffeeType;

    public CoffeeOrder(String customerName, String coffeeType){
        this.customerName = customerName;
        this.coffeeType = coffeeType;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getCoffeeType(){
        return coffeeType;
    }
}
