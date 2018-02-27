import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBorrower {

    Borrower borrower;
    Library library;
    Book book;

    @Before
    public void before(){
    borrower = new Borrower();
    library = new Library(2);
    book = new Book("Gatsby", "F Scott Fitzgerald");
    library.addBook(book);
    library.removeBook(book);
    }

    @Test
    public void canBorrowBook(){
        borrower.borrowBook(book);
        assertEquals(1, borrower.collectionTotal());
    }

    @Test
    public void canRemoveBookFromLibrary(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.stockCheck());
        assertEquals(0, borrower.collectionTotal());
        Book book1 = library.removeBook(book);
        borrower.borrowBook(book1);
        assertEquals(1, library.stockCheck());
        assertEquals(1, borrower.collectionTotal());
    }


}

