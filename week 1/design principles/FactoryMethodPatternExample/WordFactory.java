public class WordFactory extends DocumentFactory{
    
    public Document createDocument()
    {
        System.out.println("document created");
        return new WordDocument();
    }

}
