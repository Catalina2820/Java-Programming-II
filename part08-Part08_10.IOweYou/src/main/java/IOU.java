
import java.util.HashMap;


public class IOU {
    
    private HashMap<String,Double> cuentas; //toWhom, amount
    
    public IOU(){
        this.cuentas = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        cuentas.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom){     
        return cuentas.getOrDefault(toWhom, 0.0);
    }
}
