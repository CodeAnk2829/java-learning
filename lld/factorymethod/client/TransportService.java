package lld.factorymethod.client;

import lld.factorymethod.logistics.RoadLogistics;
import lld.factorymethod.logistics.SeaLogistics;
import lld.factorymethod.logistics.TransportFactory;

public class TransportService {
        private TransportFactory transportCreator;
    private String logisticType;

    public TransportService(String logisticType) {
        this.logisticType = logisticType;
    }

    public void initiateTransportation() {
        switch (logisticType) {
            case "truck":
                this.transportCreator = new RoadLogistics();
                this.transportCreator.sendDelivery();
                break;

            case "boat":
                this.transportCreator = new SeaLogistics();
                this.transportCreator.sendDelivery();
                break;

            default:
                System.out.println("Invalid logistic type");
                break;
        }
    }
}
