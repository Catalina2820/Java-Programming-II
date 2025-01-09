
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            }

            if (num > 0) {
                numbers.add(num);
            }
        }

        if (!numbers.isEmpty()) {
            for (Integer number : numbers) {
                sum += number;
            }
            System.out.println(sum * 1.0 / numbers.size());
        } else{
            System.out.println("Cannot calculate the average");
        }
    }
}
