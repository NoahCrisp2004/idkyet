import java.time.LocalTime;

public class Task {

    int id;
    static int nextId = 0;
    String description;
    String status;
    LocalTime createdAt;
    LocalTime updatedAt;

    public Task(String description){
        this.status = "Todo";
        this.description = description;
        this.createdAt = LocalTime.now();
        this.id = 1 + nextId;
        nextId += 1;
    }

    @Override
    public String toString() {
        return("Task " + id + ": " + description + " Status: " + status + " created at " + createdAt);
    }
}
