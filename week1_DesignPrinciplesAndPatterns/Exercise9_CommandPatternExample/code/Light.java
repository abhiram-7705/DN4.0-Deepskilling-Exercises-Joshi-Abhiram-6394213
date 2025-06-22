public class Light {

    private String light_status="Off";

    public void turnOn()
    {
        light_status="On";
    }
    public void turnOff()
    {
        light_status="Off";
    }
    public void displayLight()
    {
        System.out.println("Light is : "+light_status);
    }
    
}
