import java.util.Scanner;
public class App {
    
    public static void main(String[] args) throws Exception {
         TaskManager myTasks = new TaskManager();
            menu(myTasks);
    }

    public static void menu(TaskManager myTasks)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("selct the option");
        System.out.println("1. Add Task");
        System.out.println("2. Edit Task");
        System.out.println("3. Remove Task");
        System.out.println("4. View All Task");
        System.out.println("5. Filter Task By Priority");
        System.out.println("6. Exit");
        int option = sc.nextInt();

        switch(option){
            case 1:
            myTasks.addTask();
            menu(myTasks);
            case 2:
            myTasks.editTask();
            menu(myTasks);
            case 3:
            myTasks.removeTask();
            menu(myTasks);
            case 4:
            myTasks.viewTask();
            menu(myTasks);
            case 5:
            myTasks.filterTask();
            menu(myTasks);
            case 6:
            return;
            default:
            System.out.println("Please Entert the Valid Option");
            menu(myTasks);
        }   
    }
}
