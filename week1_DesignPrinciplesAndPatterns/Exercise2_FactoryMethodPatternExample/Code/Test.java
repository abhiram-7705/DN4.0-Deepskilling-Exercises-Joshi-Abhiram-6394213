public class Test {
    
    public static void main(String[] args) {
        
        System.out.println("creating a word document using WordFactory");
        DocumentFactory word=new WordFactory();
        System.out.println(word.createDocument().getDocType());

        System.out.println("creating a pdf document using PdfFactory");
        DocumentFactory pdf=new PdfFactory();
        System.out.println(pdf.createDocument().getDocType());

        System.out.println("creating an Excel document using ExcelFactory");
        DocumentFactory excel=new ExcelFactory();
        System.out.println(excel.createDocument().getDocType());

    }

}