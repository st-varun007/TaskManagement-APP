import java.util.ArrayList;
import java.util.Scanner;
public class TaskManager {
    int no_OfTask=0;
    
    Scanner sc = new Scanner(System.in);
    ArrayList<Task> taskList = new ArrayList<>();
    public void addTask()
    {
        System.out.println("enter the Name : ");
        String taskName=sc.nextLine();

        System.out.println("enter the description : ");
        String description=sc.nextLine();

        System.out.println("enter the Priority : ");
        Priority priority=Priority.valueOf(sc.nextLine());

        System.out.println("enter the status : ");
        Status status=Status.valueOf(sc.nextLine());

        Task temp = new Task(++no_OfTask,taskName, description, priority, status);
        taskList.add(temp);
        
    }

public void viewTask()
    {
        if(taskList.isEmpty()){
            System.out.println("No tasks to display.");
            return;
        }
        for(Task x : taskList)
        {
            System.out.println("ID: "+x.id);
            System.out.println("NAME: "+x.taskName);
            System.out.println("DESCRIPTION: "+x.description);
            System.out.println("PRIORITY: "+x.priority);
            System.out.println("STATUS: "+x.status);
        }
    }

public void editTask()
{
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the index: ");
    int i  = sc.nextInt();
    
    if(i<0 || i>=taskList.size())
    {
        System.out.println("Enter a valid id");
        return;
    }
    Task temp = taskList.get(i);



    System.out.println("Do you want to update the task name? (yes/no)");
    if(sc.nextLine().equalsIgnoreCase("yes")) {
        System.out.println("Enter new task name:");
        temp.taskName = sc.nextLine();
    }

    System.out.println("Do you want to update the description? (yes/no)");
    if(sc.nextLine().equalsIgnoreCase("yes")) {
        System.out.println("Enter new description:");
        temp.description = sc.nextLine();
    }

    System.out.println("Do you want to update the priority? (yes/no)");
    if(sc.nextLine().equalsIgnoreCase("yes")) {
        System.out.println("Enter new priority:");
        temp.priority = Priority.valueOf(sc.nextLine());
    }

    System.out.println("Do you want to update the status? (yes/no)");
    if(sc.nextLine().equalsIgnoreCase("yes")) {
        System.out.println("Enter new status:");
        temp.status = Status.valueOf(sc.nextLine());
    }
    taskList.set(i, temp);
    
    sc.close();
}

public void removeTask(){
    System.out.println("enter the index: ");
    int id  = sc.nextInt();
    if(id<0 || id>=taskList.size()){
        System.out.println("Enter a valid id");
        return;
    }
    taskList.remove(id);
    System.out.println("Task removed successfully");
    no_OfTask--;
}

public void filterTask() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the priority to filter tasks (High, Medium, Low):");
    Priority priority = Priority.valueOf(sc.nextLine());
    for(Task task : taskList){
        if(task.priority == priority){
            System.out.println("ID: "+task.id);
            System.out.println("NAME: "+task.taskName);
            System.out.println("DESCRIPTION: "+task.description);
            System.out.println("PRIORITY: "+task.priority);
            System.out.println("STATUS: "+task.status);
        }
    }
}

}
