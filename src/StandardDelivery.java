public class StandardDelivery extends Delivery {

    public StandardDelivery(Transport transport) {
        super(transport);
    }

    @Override
    public void deliverPackage(String packageName) {
        transport.deliver(packageName, "Standard");
    }
}