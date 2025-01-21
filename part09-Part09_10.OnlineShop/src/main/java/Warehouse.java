
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> mapProduct;
    private Map<String, Integer> mapStock;

    public Warehouse() {
        this.mapProduct = new HashMap<>();
        this.mapStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.mapProduct.put(product, price);
        this.mapStock.put(product, stock);
    }

    public int price(String product) {
        return mapProduct.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return mapStock.getOrDefault(product, 0);
    }

    public boolean take(String product) {

        int val = mapStock.getOrDefault(product, 0);

        if (val > 0) {
            mapStock.put(product, val - 1);
            return true;
        }
        
        return false;
    }

    public Set<String> products() {
        return mapProduct.keySet();
    }

}
