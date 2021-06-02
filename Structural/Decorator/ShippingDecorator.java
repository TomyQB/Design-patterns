package Structural.Decorator;

public abstract class ShippingDecorator extends Shipping {
    
    protected Shipping shipping;


    public ShippingDecorator(Shipping shipping){
        this.shipping = shipping;
    }

    @Override
    public abstract String send();

    @Override
    public abstract double calculateCost();
}
