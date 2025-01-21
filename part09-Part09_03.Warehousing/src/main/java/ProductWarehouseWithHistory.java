
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();
        this.addToWarehouse(initialBalance);
    }

    public String history() {
        return history.toString();
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        history.add(this.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        double take = super.takeFromWarehouse(amount);
        history.add(this.getBalance());
        return take;
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + this.getName() 
                + "\nHistory: " + this.history 
                + "\nLargest amount of product: " + history.maxValue()
                + "\nSmallest amount of product: " + history.minValue()
                + "\nAverage: " + history.average());
    }
}
