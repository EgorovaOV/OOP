package lesson2;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setMakeOrder();
        human.setTakeOrder();
        human.isMakeOrder();
        System.out.println(human.isMakeOrder());
        human.isTakeOrder();
        System.out.println(human.isTakeOrder());
        Market market = new Market();
        market.acceptToMarket(human);
        market.releaseFromMarket(human);
        market.update();
        market.takeQueue(human);
        market.takeOrders();
        market.giveOrders();
        market.releaseFromQueue();
    }
}
