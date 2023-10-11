package lesson1;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee("latte", 440, 60);
        coffee.print();



        HotDrinkMachine hotDrinkMachine = new HotDrinkMachine();
        System.out.println(hotDrinkMachine.getProduct(2, 200));
        System.out.println(hotDrinkMachine.getProduct(3, 150, 70));
    }
}

