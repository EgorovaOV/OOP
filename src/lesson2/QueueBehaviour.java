package lesson2;

public interface QueueBehaviour {
    void takeQueue(Human human);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();
}
