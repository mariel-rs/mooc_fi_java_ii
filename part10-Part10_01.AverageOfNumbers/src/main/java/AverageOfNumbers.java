
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<>();

        System.out.println("Input numbers, type 'end' to stop.");

        while (true) {
            
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            numbers.add(input);
        }

        // Average calc

        double average = numbers.stream()
                                .mapToInt(num -> Integer.valueOf(num))
                                .average()
                                .getAsDouble();

        System.out.println("average of the numbers: " + average);

    }
}
