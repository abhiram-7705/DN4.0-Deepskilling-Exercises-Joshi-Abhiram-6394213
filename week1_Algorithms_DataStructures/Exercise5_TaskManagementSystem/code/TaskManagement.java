import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TaskManagement {
    private List<Task> list=new LinkedList<>();
    Iterator<Task> itr;
    boolean found;
    public void addTask(Task task)
    {
        list.add(task);
    }
    public void deleteTask(int id)
    {
        found=false;
        itr=list.iterator();
        while (itr.hasNext()) {
        Task task = itr.next();
        if (task.getID()==id) {
            found=true;
            itr.remove();
        }
    }
        if(found==false)
        {
            System.out.println("task not found");
        }
    }
    public void searchTask(int id)
    {
        found=false;
        System.out.println("searching for the task");
        itr=list.iterator();
        while (itr.hasNext()) {
        Task task = itr.next();
        if (task.getID()==id) {
            found=true;
                System.out.println("task found with id : "+id);
                break;
            }
        }
        if(found==false)
        {
            System.out.println("task not found");
        }
    }
    public void traverseTask()
    {
        System.out.println("traversing the list");
        itr=list.iterator();
        while (itr.hasNext()) {
        Task task = itr.next();
        System.out.println(task.toString());
        }
    }
}
