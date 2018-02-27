import java.util.ArrayList;

public class Borrower {

    ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<>();
    }

    public void borrowBook(Book book){
        this.collection.add(book);
    }

    public int collectionTotal(){
        return this.collection.size();
    }

}
