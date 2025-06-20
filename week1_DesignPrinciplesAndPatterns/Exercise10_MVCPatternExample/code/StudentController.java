public class StudentController {
    
    Student student;
    StudentView view;

    StudentController(Student s,StudentView v)
    {
        student=s;
        view=v;
    }

    public void setName(String name)
    {
        student.setName(name);
    }

    public String getName()
    {
        return student.getName();
    }
    public void setId(int id)
    {
        student.setId(id);
    }

    public int getId()
    {
        return student.getId();
    }
    public void setGrade(double grade)
    {
        student.setGrade(grade);
    }

    public double getGrade()
    {
        return student.getGrade();
    }

    public void viewDisplay()
    {
        view.displayStudentDetails(student.getName(), student.getId(), student.getGrade());
    }


}
