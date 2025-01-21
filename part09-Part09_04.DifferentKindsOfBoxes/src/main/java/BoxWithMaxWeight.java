
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }

    @Override
    public void add(Item nitem) {
        int actual = 0;
        for (Item item : items) {
            actual += item.getWeight();
        }

        if (actual + nitem.getWeight() > this.capacity) {
            return;
        }

        this.items.add(nitem);
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }

}
