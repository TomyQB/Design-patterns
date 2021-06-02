package Structural.Decorator;

public abstract class Shipping {
    
    private int shippingID;
    private String destinationAddress;
    private String sourceAddress;
    private String destinationPC;
    private String sourcePC;
    protected double weight;

    public Shipping(){};

    public Shipping(String destinationAddress, String sourceAddress, String destinationPC, String sourcePC, double weight) {
        this.shippingID = getShippingID();
        this.destinationAddress = destinationAddress;
        this.sourceAddress = sourceAddress;
        this.destinationPC = destinationPC;
        this.sourcePC = sourcePC;
        this.weight = weight;
    }

    private static int lastID= 0;

    private int getShippingID() {
        return ++lastID;
    }
    
    protected abstract double calculateCost();
    
    public abstract String send();
    
}
