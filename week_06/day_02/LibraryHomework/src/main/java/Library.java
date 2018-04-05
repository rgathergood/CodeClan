import java.util.ArrayList;

public class Library {

    private String name;
    private int capacity;
    private ArrayList<Book> books;

    public Library () {
        this.capacity = 4;
        this.books = new ArrayList<>();
    }

    public int bookCount() {
        return this.books.size();
    }

    public boolean isUnderCapacity() {
        return this.bookCount() < this.capacity;
    }

    public void addBook(Book book) {
        if (this.isUnderCapacity()) {
            this.books.add(book);
        }
    }

    public Book rentOut() {
        if (this.bookCount() > 0) {
            return this.books.remove(0);
        }
        return null;
    }

}
