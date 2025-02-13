
public class Item {
    
    private String product;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
    public int price(){
        return unitPrice * qty;
    }
    
    public void increaseQuantity(){
        this.qty++;
    }

    @Override
    public String toString() {
        return product + ": " + qty;
    }
}
