package lld.simplefactorymethod;

import lld.simplefactorymethod.order.OrderFactory;
import lld.simplefactorymethod.order.Iorder;

public class Main {
    public static void main(String... args) {
        Iorder newOrder = OrderFactory.createOrderType("dineInOrder");
        newOrder.createOrder();
    }
}
