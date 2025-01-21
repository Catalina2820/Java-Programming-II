
import java.util.ArrayList;

public class Box implements Packable{

    private double capacity;
    private ArrayList<Packable> items;

    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable itemPackable) {

        if (weight() + itemPackable.weight() >= capacity) {
            return;
        }

        this.items.add(itemPackable);
    }

    @Override
    public double weight() {
        double total = 0;

        if (items.size() == 0) {
            return 0.0;
        }

        for (Packable item : items) {
            total += item.weight();
        }

        return total;
    }
    
    
    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg" ;
    }

}
