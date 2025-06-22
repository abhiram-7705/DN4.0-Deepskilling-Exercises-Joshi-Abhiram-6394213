public class Employee {
    private int employeeID;
    private String employeeName;
    private String position;
    private double salary;

    public Employee(int employeeID,String employeeName,String position,double salary)
    {
        this.employeeID=employeeID;
        this.employeeName=employeeName;
        this.position=position;
        this.salary=salary;
    }
    public String toString()
    {
        return employeeID+"\t"+employeeName+"\t"+position+"\t"+salary;
    }
    public int getID() {
        return employeeID;
    }

}