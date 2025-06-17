public class PdfFactory extends DocumentFactory{
    
    public Document createDocument()
    {
        System.out.println("document created");
        return new PDFDocument();
    }
}
