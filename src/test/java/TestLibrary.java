import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    Library library;
    Book book;


    @Before
    public void before(){
        library = new Library(10);
        book = new Book();
    }

    @Test
    public void libraryStockLevel(){
        assertEquals(0, library.stockCheck());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book);
        assertEquals(1, library.stockCheck());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.stockCheck());
        library.removeBook(book);
        assertEquals(1, library.stockCheck());
    }


}
