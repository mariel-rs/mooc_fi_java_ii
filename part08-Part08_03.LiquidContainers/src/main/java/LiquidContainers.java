
import java.nio.file.AtomicMoveNotSupportedException;
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstVolume = 0;
        int secondVolume = 0;

        while (true) {

            System.out.println("First: " + firstVolume + "/100");
            System.out.println("Second: " + secondVolume + "/100");

            //System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] params = input.split(" ");
            int amount = Integer.valueOf(params[1]);

            // Add amount functionality
            if (params[0].equals("add") && amount > 0) {

                firstVolume += amount;

                if (firstVolume > 100) {
                    firstVolume = 100;
                }
            }

            // Move liquid functionality
            if (params[0].equals("move") && amount > 0) {  

                if (firstVolume < amount) {
                    amount = firstVolume;
                }

                firstVolume -= amount;
                secondVolume += amount;

                if (secondVolume > 100) {
                    secondVolume = 100;
                }

            }

            // Remove liquid
            if (params[0].equals("remove") && amount > 0) {
                
                secondVolume -= amount;

                if (secondVolume < 0) {
                    secondVolume = 0;
                }
            }
        }
    }

}
