
import java.util.Scanner;


public class UserInterface {

    private TodoList list;
    private Scanner scan;

    public UserInterface(TodoList list, Scanner scan) {
        this.list = list;
        this.scan = scan;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String opt = scan.nextLine();

            switch (opt) {
                case "stop":
                    return;
                case "add":
                    add();
                    break;
                case "list":
                    list.print();
                    break;
                case "remove":
                    remove();
                    break;
                default:
                    break;
            }
        }
    }

    public void add() {
        System.out.print("To add: ");
        String task = scan.nextLine();
        list.add(task);
    }

    public void remove() {
        System.out.print("Which one is removed? ");
        int index = Integer.valueOf(scan.nextLine());
        list.remove(index);
    }
}
