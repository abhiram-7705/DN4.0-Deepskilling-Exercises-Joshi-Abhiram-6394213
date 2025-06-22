public class Book {
    private int bookID;
    private String title;
    private String author;

    public Book(int id,String title,String author)
    {
        bookID=id;
        this.title=title;
        this.author=author;
    }
    public String getTitle()
    {
        return title;
    }

}