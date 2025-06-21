public class RealImage implements Image{
    private String filename;
    public RealImage(String filename)
    {
        this.filename=filename;
    }
    public void display()
    {
        System.out.println("loading image..."+filename);
    }
}
