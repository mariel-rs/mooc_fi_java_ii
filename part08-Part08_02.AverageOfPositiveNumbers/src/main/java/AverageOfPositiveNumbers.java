import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         * Write a program that asks user for input until the user inputs 0. 
         * After this, the program prints the average of the positive numbers 
         * (numbers that are greater than zero).

            If no positive number is inputted, the program prints 
            "Cannot calculate the average"
         */

        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        int sum = 0;

        while (true) {
            
            int input = scanner.nextInt();

            if (input == 0) {
                break;
            }

            if (input > 0) {
                sum += input;
                positiveNumbers.add(input);
            }
        }

        if (positiveNumbers.isEmpty()) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(1.0 * sum / positiveNumbers.size());
        }

    }
}
