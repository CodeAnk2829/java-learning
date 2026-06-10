package lld.factorymethod.logistics;

class RoadTransport implements ITransport {
    public void deliver() {
        System.out.println("Delivering via road...");
    }
}
