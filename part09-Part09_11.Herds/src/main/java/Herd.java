
import java.util.ArrayList;


public class Herd implements Movable{
    private ArrayList<Movable> herds;

    public Herd() {
        herds = new ArrayList<>();
    }

    @Override
    public String toString() {
        String lista = "";
        
        for (Movable herd : herds) {
            lista += herd.toString() + "\n";
        }        
        return lista;
    }
    
    public void addToHerd(Movable movable){
        herds.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable herd : herds) {
            herd.move(dx, dy);
        }
    }
}
