
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> car;

    public ShoppingCart() {
        this.car = new HashMap<>();
    }

    public void add(String product, int price) {
        if (car.containsKey(product)) {
            car.get(product).increaseQuantity();
        } else {
            car.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int total = 0;
        for (Item item : car.values()) {
            total += item.price();
        }
        return total;
    }

    public void print() {
        for (Item item : car.values()) {
            System.out.println(item);
        }
    }
}
