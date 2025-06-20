public class Student {

    private String name;
    private int id;
    private double grade;

    public Student(String name,int id,double grade)
    {
        this.name=name;
        this.id=id;
        this.grade=grade;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }
    public void setGrade(double grade)
    {
        this.grade=grade;
    }
    public double getGrade()
    {
        return grade;
    }
    
}