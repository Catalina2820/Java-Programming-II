
import java.util.ArrayList;


public class TodoList {

    private ArrayList<String> tasks;

    public TodoList() {
        tasks = new ArrayList();
    }

    public void add(String task) {
        this.tasks.add(task);
    }

    public void print() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ": " + tasks.get(i));
        }
    }

    public void remove(int number) {
        int index = number - 1;
        if (index < 0 || index >= tasks.size()) {
            return;
        }

        tasks.remove(index);
    }
}
