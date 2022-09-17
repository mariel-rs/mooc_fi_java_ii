
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

        while (true) {

            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] params = input.split(" ");
            int amount = Integer.valueOf(params[1]);

            if (params[0].equals("add")) {
                first.add(amount);
            }

            if (params[0].equals("move")) {  

                if (first.contains() < amount) {
                    amount = first.contains();
                }

                first.remove(amount);
                second.add(amount);

            }

            if (params[0].equals("remove")) {
                second.remove(amount);
            }
        }
    }
}