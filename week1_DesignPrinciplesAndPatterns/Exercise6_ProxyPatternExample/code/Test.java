public class Test
{
    public static void main(String[] args) {
        
        Image image1=new ProxyImage("image1.jpg");
        System.out.println("creating a real image1 using proxy");
        image1.display();

        Image image2=new ProxyImage("image2.jpg");
        System.out.println("creating a real image2 using proxy");
        image2.display();
        
        Image image3=new ProxyImage("image3.jpg");
        System.out.println("creating a real image3 using proxy");
        image3.display();
        
        System.out.println("creating an existing image..");
        Image image4=new ProxyImage("image1.jpg");
        image4.display();

    }
}
