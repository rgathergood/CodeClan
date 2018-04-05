import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LibraryTest {

    private Library library;
    private Book book;
    private Borrower borrower;

    @Before
    public void before() {
        library = new Library();
        book = new Book();
    }

    @Test
    public void canGetLibraryStock() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBookToLibrary() {
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void checkLibraryUnderCapacity() {
        assertTrue(library.isUnderCapacity());
    }

    @Test
    public void checkLibraryAtCapacity() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertFalse(library.isUnderCapacity());
    }

    @Test
    public void cannotAddBookIfAtCapacity() {
        for (int i = 0; i<5; i++) {
            library.addBook(book);
        }
        assertEquals(4, library.bookCount());
    }

    @Test
    public void canRentBook() {
        library.addBook(book);
        assertEquals(book, this.library.rentOut());
    }
}
