package Structural.Decorator;

public class Package extends Shipping {
    
    public Package (String destinationAddress, String sourceAddress, String destinationPC, String sourcePC, double weight){
        super(destinationAddress, sourceAddress, destinationPC, sourcePC, weight);
    }

    @Override
    public double calculateCost(){
        return 0.2 * weight;
    }

    @Override
    public String send() {
        return "**** PACKAGE ***";
    }
}
