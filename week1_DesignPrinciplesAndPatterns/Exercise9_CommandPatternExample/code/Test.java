public class Test {
    public static void main(String[] args) {
        Light light=new Light();
        System.out.println("created a light....");

        System.out.println("creating a command to turn on light...");
        Command cmd1=new LightOnCommand(light);

        System.out.println("creating a command to turn off light...");
        Command cmd2=new LightOffCommand(light);

        System.out.println("creating a remote controller to execute the commands..");
        RemoteControl rc=new RemoteControl();

        light.displayLight();
        System.out.println("turning on the light...");
        rc.lightOn(cmd1);
        light.displayLight();

        System.out.println("turning off the light...");
        rc.lightOn(cmd2);
        light.displayLight();
    }
}
