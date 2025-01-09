
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String word = scanner.nextLine();

            if (word.equals("end")) {
                break;
            } else {
                int rta = Integer.valueOf(word);
                System.out.println((rta * rta * rta));
            }

        }
    }
}
