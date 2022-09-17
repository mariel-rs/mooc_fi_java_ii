import java.util.Scanner;

public class UserInterface {
    
    private TodoList tasks;
    private Scanner scan;

    public UserInterface(TodoList taskList, Scanner scan) {
        this.tasks = taskList;
        this.scan = scan;
    }

    public void start() {
        
        while (true) {
            
            System.out.println("Command:");

            String command = scan.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                System.out.println("To add: ");
                String task = scan.nextLine();

                tasks.add(task);
            } else if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int taskNumber = Integer.valueOf(scan.nextLine());

                tasks.remove(taskNumber);
            } else if (command.equals("list")) {
                tasks.print();
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
