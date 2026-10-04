public class Main {

    public static void main(String[] args) {

        Transport bike = new BikeTransport();
        Transport drone = new DroneTransport();

        Delivery standardDelivery =
                new StandardDelivery(bike);

        standardDelivery.deliverPackage("Laptop");

        System.out.println("\nChanging transport...\n");

        standardDelivery.setTransport(drone);

        standardDelivery.deliverPackage("Laptop");

        System.out.println();

        Delivery expressDelivery =
                new ExpressDelivery(drone);

        expressDelivery.deliverPackage("Smartphone");
    }
}