enum Priority{
    High,
    Medium,
    Low
}

enum Status{
    Pending,
    In_Progress,
    Completed
}

public class Task {
    int id;
    String taskName;
    String description;
    Priority priority;
    Status status;

    Task(int id, String taskName,String desciprtion,Priority priority, Status status)
    {
        this.id = id;
        this.taskName = taskName;
        this.description= desciprtion;
        this.priority = priority;
        this.status = status;
    }
    
}
