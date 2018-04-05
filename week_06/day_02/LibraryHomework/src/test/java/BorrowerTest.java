import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Library Library;
    Book book;
    Borrower borrower;

    @Before
    public void before() {
        this.Library = new Library();
        this.book = new Book();
        this.borrower = new Borrower("Cathy");
    }

    @Test
    public void canGetCollectionCount() {
        assertEquals(0, borrower.collectionCount());
    }

    @Test
    public void canAddBookToCollection() {
        borrower.addBook(book);
        assertEquals(1, borrower.collectionCount());
    }

    @Test
    public void canRentBook() {
        this.Library.addBook(book);
        this.borrower.rentBook(Library);
        assertEquals(0, this.Library.bookCount());
    }
}
