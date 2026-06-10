package lld.factorymethod.logistics;

public class SeaLogistics extends TransportFactory {
    public ITransport createTransport() {
        return new SeaTransport();
    }
}
