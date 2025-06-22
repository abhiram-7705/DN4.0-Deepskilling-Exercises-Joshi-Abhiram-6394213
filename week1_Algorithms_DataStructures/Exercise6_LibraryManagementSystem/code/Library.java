public class Library {
    
    boolean found;
    public void linearSearch(String title,Book books[])
    {
        found=false;
        for(Book b:books)
        {
            if(b.getTitle().equals(title))
            {
                found=true;
                System.out.println("found the book with title : "+title);
                break;
            }
        }
        if(found==false)
        {
            System.out.println("cannot find the book with title : "+title);
        }
    }

    public void binarySearch(String title,Book books[])
    {
        found=false;
        int left=0;
        int right=books.length-1;

        int mid;
        while(left<=right)
        {
            mid=(left+right)/2;
            if(books[mid].getTitle().equals(title))
            {
                System.out.println("book found with title : "+title);
                found=true;
                break;
            }
            if(books[mid].getTitle().compareTo(title)>0)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        if(found==false)
        {
            System.out.println("cannot find book with title : "+title);
        }
    }

}
