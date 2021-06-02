package Structural.Decorator;

public class Urgent extends ShippingDecorator {

    public Urgent(Shipping shipping){
        super(shipping);
    }

    public String send(){
        return this.shipping.send() + "\n**** URGENTE ***" ;
    }

    public double calculateCost(){
        return this.shipping.calculateCost() + 5.0;
    }
    
}
