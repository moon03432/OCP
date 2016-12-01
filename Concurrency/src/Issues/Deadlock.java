package Issues;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by moon on 30/11/2016.
 *
 * Deadlock example
 *
 * In reality it's quite hard to prevent deadlock
 */
public class Deadlock {

    private static class Food {}
    private static class Water {}

    private static class Fox {
        public void eatAndDrink(Food food, Water water) {
            synchronized (food) {
                System.out.println("Got Food!");
                move();
                synchronized (water) {
                    System.out.println("Got Water!");
                }
            }
        }

        public void drinkAndEat(Food food, Water water) {
            synchronized (water) {
                System.out.println("Got Water!");
                move();
                synchronized (food) {
                    System.out.println("Got Food!");
                }
            }
        }

        public void move() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // handle exception
            }
        }
    }

    public static void main(String[] args) {
        Fox foxy = new Fox();
        Fox tails = new Fox();
        Food food = new Food();
        Water water = new Water();

        ExecutorService service = null;

        try {
            service = Executors.newScheduledThreadPool(10);
            service.submit(() -> foxy.eatAndDrink(food, water));
            service.submit(() -> tails.drinkAndEat(food, water));
        } finally {
            if (service != null) service.shutdown();
        }
    }
}
