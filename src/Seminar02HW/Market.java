package Seminar02HW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour{
    private List<Actor> queue;
    public Market() {
        this.queue = new ArrayList<>();
    }
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " пришел в магазин.");
        queue.add(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actorList) {
        for (Actor actor : actorList) {
            System.out.println(actor.getName() + " вышел из магазина.");
            queue.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " добавлен в очередь.");
        queue.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " взял заказ.");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder() && !actor.isTakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " получил свой заказ.");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        Iterator<Actor> iterator = queue.iterator();
        while (iterator.hasNext()) {
            Actor actor = iterator.next();
            if (actor.isTakeOrder()) {
                System.out.println(actor.getName() + " вышел из очереди.");
                iterator.remove();
            }
        }
    }
}
