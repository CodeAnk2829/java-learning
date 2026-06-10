package lld.simplefactorymethod.order;

public class OrderFactory {
    public static Iorder createOrderType(String orderType) {
        switch (orderType) {
            case "dineInOrder":
                return new DineInOrder();
            
            case "takeOutOrder": 
                return new TakeOutOrder();

            case "deliveryOrder": 
                return new DeliveryOrder();

            default:
                return null;
        }
    }
}
