
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        String[] arguments;

        boolean run = true;
        do{
            System.out.print("task-cli ");
            String input = scanner.nextLine();
            arguments = input.split(" ");
            if(arguments.length > 3){
                System.out.println("task-cli invalid command.");
            }
            switch(arguments[0].toLowerCase()){

                case "add":
                    if (arguments.length == 2){
                        tasks.add(taskManager.add(arguments[1]));
                        System.out.println(tasks.get(0).toString());
                    } else{
                        System.out.println("task-cli invalid command.");
                    }
                    break;

                    case "update":
                    break;
                case "delete":
                    break;
                case "mark-in-progress":
                    break;
                case "mark-done":
                    break;
                case "list":

            }


        } while (run);
    }
}