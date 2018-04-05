import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> collection;

    public Borrower (String name) {
        this.name = name;
        this.collection = new ArrayList<>();
    }

    public int collectionCount() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        this.collection.add(book);
    }

    public void rentBook(Library library) {
        this.collection.add(library.rentOut());
    }
}
