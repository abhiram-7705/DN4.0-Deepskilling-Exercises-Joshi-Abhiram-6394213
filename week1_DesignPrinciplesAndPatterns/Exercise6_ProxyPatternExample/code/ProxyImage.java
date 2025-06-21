import java.util.HashMap;
import java.util.Map;

public class ProxyImage implements Image{

    private static final Map<String,Image> cache=new HashMap<>();

    private Image image;
    private String filename;
    public ProxyImage(String filename)
    {
        this.filename=filename;
    }

    public void display()
    {
        image=cache.get(filename);
        if(image==null)
        {
            System.out.println("image does not exist.. creating a new image..");
            image=new RealImage(filename);
            cache.put(filename,image);
        }
        else
        {
            System.out.println("image already exists");
        }
        image.display();
    }
}
