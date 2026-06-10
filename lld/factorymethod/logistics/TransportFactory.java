package lld.factorymethod.logistics;

public abstract class TransportFactory {
    abstract ITransport createTransport();

    // bussiness logic lives here
    public void sendDelivery() { // factory method
        ITransport transport = this.createTransport();
        transport.deliver();
    }
}
