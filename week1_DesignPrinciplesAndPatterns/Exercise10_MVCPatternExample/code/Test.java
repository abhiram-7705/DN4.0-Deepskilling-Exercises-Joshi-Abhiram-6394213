public class Test {
    public static void main(String[] args) {

        Student s=new Student("abcd", 1, 8.50);
        StudentView v=new StudentView();
        StudentController controller=new StudentController(s, v);
    
        System.out.println("displaying student details");
        controller.viewDisplay();

        System.out.println("modifying student details");
        controller.setName("abhiram");
        controller.setId(28);
        controller.setGrade(9.0);

        System.out.println("displaying modified data");
        controller.viewDisplay();

    }
}
