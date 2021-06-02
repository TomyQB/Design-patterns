package Structural.Decorator;

public class Fragile extends ShippingDecorator {

    public Fragile(Shipping shipping){
        super(shipping);
    }

    public String send(){
        return this.shipping.send() + "\n**** FRAGILE ***" ;
    }

    public double calculateCost(){
        return this.shipping.calculateCost() + 2.0;
    }
    
}
