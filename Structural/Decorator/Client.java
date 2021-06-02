package Structural.Decorator;

import java.util.Scanner;

public class Client {

    private String destinationAddress;
    private String sourceAddress;
    private String destinationPC;
    private String sourcePC;
    private Shipping myShipping;
    private double weight;
    private String urgent;
    private String fragile;
    private Scanner console = new Scanner(System.in);

    public Client(){}
    
    public void makeShipment() {
        String rest;
        setShippingDetails();  
           
        myShipping =  new Package(destinationAddress, sourceAddress, destinationPC, sourcePC, weight);

        if (urgent.equals("yes")) myShipping = new Urgent(myShipping);
        if (fragile.equals("yes")) myShipping = new Fragile(myShipping);

        rest = myShipping.send();
        System.out.println(rest);
        System.out.println("\nTotal a pagar: " + myShipping.calculateCost());       
    }

    private void setShippingDetails() {
        setSourceAddress();
        setSourcePC();
        setDestinationAddress();
        setDestinationPC();
        setUrgent();
        setFragile();
        setWeight();
    }

    private void setUrgent() {
        System.out.print("Urgent(yes/no): ");
        urgent = console.nextLine();
    }

    private void setFragile() {
        System.out.print("Fragile(yes/no): ");
        fragile = console.nextLine();
    }

    private void setWeight() {
        System.out.print("Weight: ");
        weight = console.nextDouble();
    }

    private void setDestinationPC() {
        System.out.print("Destination postal code: ");
        destinationPC = "40000";
        System.out.println("40000");
    }

    private void setDestinationAddress() {
        System.out.print("Destination address: ");
        destinationAddress = "Calle Colón";
        System.out.println("Avenida Blasco Ibáñez");
    }

    private void setSourcePC() {
        System.out.print("Source postal code: ");
        sourcePC = "31000";
        System.out.println("31000");
    }

    private void setSourceAddress() {
        System.out.print("Source address: ");
        sourceAddress = "Avenida Blasco Ibáñez";
        System.out.println("Avenida Blasco Ibáñez");
    }
}
