public class Test {
    public static void main(String[] args) {

        System.out.println("creating a library");
        Library library=new Library();
     
        System.out.println("creating books for library");
        Book[] books = new Book[] {
        new Book(1,"adventures", "xyz"),
        new Book(2,"brain", "abc"),
        new Book(3,"celebrations", "efg"),
        new Book(4,"deccan", "shs"),
        new Book(5,"elephants", "lew"),
        new Book(6,"forest", "hse"),
        new Book(7,"games", "jsje"),
        new Book(8,"kites", "dje"),
        new Book(9,"vehicles", "hhs"),
        new Book(10,"zebras", "ehe")
        };

        System.out.println("searching for 'kites' using linear search");
        library.linearSearch("kites", books);

        System.out.println("searching for 'celebrations' using binary search");
        library.binarySearch("celebrations", books);
    }
}
