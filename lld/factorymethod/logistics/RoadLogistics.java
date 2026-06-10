package lld.factorymethod.logistics;

public class RoadLogistics extends TransportFactory {
    public ITransport createTransport () {
        return new RoadTransport(); 
    }
}
