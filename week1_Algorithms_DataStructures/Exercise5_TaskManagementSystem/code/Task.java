public class Task {
    private int taskID;
    private String taskName;
    private String status;

    public Task(int id,String name,String status)
    {
        this.taskID=id;
        this.taskName=name;
        this.status=status;
    }

    public int getID() {
        return taskID;
    }
    public String toString()
    {
        return taskID+"\t"+taskName+"\t"+status;
    }

}