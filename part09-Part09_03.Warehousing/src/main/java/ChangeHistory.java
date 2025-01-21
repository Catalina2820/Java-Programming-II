
import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    @Override
    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        if (history.isEmpty()) {
            return 0;
        }

        double max = history.get(0);

        for (Double double1 : history) {
            if (max < double1) {
                max = double1;
            }
        }
        return max;
    }

    public double minValue() {
        if (history.isEmpty()) {
            return 0;
        }

        double min = history.get(0);

        for (Double double1 : history) {
            if (min > double1) {
                min = double1;
            }
        }
        return min;
    }
    
    public double average(){
        double sum = 0;
        
        for (Double double1 : history) {
            sum += double1;
        }
        
        return sum / history.size();
    } 
}
