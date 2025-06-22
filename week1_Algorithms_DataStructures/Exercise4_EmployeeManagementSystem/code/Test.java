import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        EmployeeManagement management=new EmployeeManagement();
        int id;
        String name,position;
        double salary;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.of employee records to store");
        int n=sc.nextInt();
        management.createArray(n);
        System.out.println("adding new employees");
        for(int i=0;i<n;i++)
        {
            System.out.println("enter id, name, position, salary");
            id=sc.nextInt();
            sc.nextLine();
            name=sc.nextLine();
            position=sc.nextLine();
            salary=sc.nextDouble();
            management.addEmployee(id,name,position,salary);
        }
        System.out.println("traversing the employee array....");
        management.traverseEmployee();
        
        System.out.println("searching for an employee with id '1'");
        management.searchEmployee(1);
        
        System.out.println("deleting an employee with id '2'");
        management.deleteEmployee(2);
        
        System.out.println("traversing the employee array....");
        management.traverseEmployee();
        sc.close();
    }
}
