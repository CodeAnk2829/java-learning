package lld.factorymethod.logistics;

class SeaTransport implements ITransport {
    public void deliver() {
        System.out.println("Delivering via sea...");
    }
}
