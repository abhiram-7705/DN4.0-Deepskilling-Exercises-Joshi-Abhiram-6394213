public class Test {
    public static void main(String[] args) {
        TaskManagement manager = new TaskManagement();

        System.out.println("adding new tasks...");
        manager.addTask(new Task(1, "assignments", "Pending"));
        manager.addTask(new Task(2, "Coding", "In Progress"));
        manager.addTask(new Task(3, "Playing", "Completed"));

        System.out.println("tasks");
        manager.traverseTask();

        System.out.println("Searching for Task with id'2'");
        manager.searchTask(2);

        System.out.println("deleting Task ID 1...");
        manager.deleteTask(1);

        System.out.println("tasks");
        manager.traverseTask();

    }
}
