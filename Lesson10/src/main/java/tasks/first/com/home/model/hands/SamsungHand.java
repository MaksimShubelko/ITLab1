package tasks.first.com.home.model.hands;

import tasks.first.com.home.utils.Actions;

public class SamsungHand implements IHand {
    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }

    public SamsungHand() {
    }

    @Override
    public String upHand() {
        return Actions.SAMSUNG_HAND_MOVES.getAction();
    }

    @Override
    public int getPrice() {
        return price;
    }
}

