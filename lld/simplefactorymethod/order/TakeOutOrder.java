package lld.simplefactorymethod.order;

class TakeOutOrder implements Iorder {
    public void createOrder() {
        System.out.println("Preparing Takeout order...");
    }
}
