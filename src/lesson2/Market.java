package lesson2;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour{
        public List<Human> humans = new ArrayList<>();
        @Override
        public void acceptToMarket(Human human) {
                //List<Human> humans = new ArrayList<>();
                this.humans = humans;
                humans.add(human);
                System.out.println("WOW");

        }

        @Override
        public void releaseFromMarket(Human human) {
                if (human.isTakeOrder()){
                        humans.clear();
                        System.out.println("Bay-bay");
                }

        }

        @Override
        public void update() {
                System.out.println("Your market is update");
        }

        @Override
        public void takeQueue(Human human) {

                System.out.println("If you make order, take queue ");
        }

        @Override
        public void takeOrders() {
                System.out.println("Please, take away your order");
        }


        @Override
        public void giveOrders() {
                System.out.println("Hello, what do you want to order?");
        }

        @Override
        public void releaseFromQueue() {
                System.out.println("Please, go to your lesson of OOP, this place not for students");
        }
    }


