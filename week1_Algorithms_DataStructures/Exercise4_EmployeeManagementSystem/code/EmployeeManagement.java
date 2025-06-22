public class EmployeeManagement {
    
    private int n;
    Employee employee[];
    private int count=0;
    boolean found;
    public void createArray(int n)
    {
        this.n=n;
        employee=new Employee[n];
    }
    public void addEmployee(int employeeID,String employeeName,String position,double salary)
    {
        if(count<n)
        {
            employee[count]=new Employee(employeeID, employeeName, position, salary);
            count++;
        }
        else
        {
            System.out.println("array size exceeded");
        }
    }
    public void traverseEmployee()
    {
        System.out.println("Employee records");
        for(int i=0;i<count;i++)
        {
            System.out.println(employee[i].toString());
        }
    }
    public void searchEmployee(int id)
    {
        found=false;
        System.out.println("Searching Employee records");
        for(int i=0;i<count;i++)
        {
            if(employee[i].getID()==id)
            {
                found=true;
                System.out.println("employee found\n"+employee[i].toString());
                break;
            }
        }
        if(found==false)
        {
            System.out.println("employee not found");
        }
    }

    public void deleteEmployee(int id)
    {
        found=false;
        for(int i=0;i<=count;i++)
        {
            if(employee[i].getID()==id)
            {
                found=true;
                System.out.println("deleting the employee record");
                for(int j=i;j<count-1;j++)
                {
                    employee[j]=employee[j+1];
                }
                count--;
                break;
            }
        }
        if(found==false)
        {
            System.out.println("employee not found");
        }
    }

}
